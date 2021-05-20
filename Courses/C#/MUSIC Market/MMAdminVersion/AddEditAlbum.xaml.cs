using MMLibrary;
using System;
using System.Collections.Generic;
using System.Data.Entity.Infrastructure;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Shapes;

namespace MMAdminVersion
{
    /// <summary>
    /// Interaction logic for AddEditAlbum.xaml
    /// </summary>
    public partial class AddEditAlbum : Window
    {
        DBConnection ctx = new DBConnection();
        ManipulateDB manip = new ManipulateDB();
        List<Album> albumList = new List<Album>();
        private Artist currAlbumArtist;
        private Album currAlbum;
        private bool referenceOnly;

        public Artist ReturnCurrArtist  //Readonly property used to return current album artist
        {
            get { return currAlbumArtist; }
        }

        public Album ReturnCurrAlbum    //Readonly property used to return current album
        {
            get { return currAlbum; }
        }

        public AddEditAlbum(bool CalledForReference = false)
        {
            try
            {
                InitializeComponent();
                referenceOnly = CalledForReference; //switch if window was called to Add/Edit album or retrun album to another window
                if (referenceOnly)
                {
                    btArtistForAlbum.IsEnabled = false;  //disable calling artist dialog
                }
                albumList = manip.RetrieveAllAlbums();   //retrieve and populate listview with albums
                lvAlbums.ItemsSource = albumList;
                btAddEditAlbum.Content = referenceOnly ? "Select" : "Add";
            }
            catch (SystemException ex)
            {
                MessageBox.Show(ex.Message, "Database operation failed", MessageBoxButton.OK, MessageBoxImage.Warning);
            }

        }

        private void lvAlbums_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {
            if (lvAlbums.SelectedIndex == -1)       //actions if nothing selected
            {
                btAddEditAlbum.Content = referenceOnly ? "Select" : "Add";
                currAlbum = null;
                currAlbumArtist = null;
                btArtistForAlbum.IsEnabled = true;
                RefreshGUI();
                return;
            }
            currAlbum = (Album)lvAlbums.SelectedItem;
            if (currAlbum.Artist != null)    //if album is associated with existing artist load Artist
            {
                currAlbumArtist = currAlbum.Artist;
            }
            btAddEditAlbum.Content = referenceOnly ? "Select" : "Update";  //update GUI according to current album data
            lblAlbumID.Content = currAlbum.Id;
            btDelete.IsEnabled = true;
            tbAlbumName.Text = currAlbum.AlbumName;
            tbAlbumPrice.Text = currAlbum.AlbumPrice.ToString();
            dpAlbumReleaseDate.SelectedDate = currAlbum.ReleaseDate;
            lblcurrAlbumArtistId.Content = currAlbum.ArtistId.ToString();
            lblcurrAlbumArtistName.Content = currAlbum.Artist.ArtistName;
            btArtistForAlbum.IsEnabled = false;
        }

        private void btArtistForAlbum_Click(object sender, RoutedEventArgs e)  //call dialog to get new/existing Artist
        {
            try
            {
                AddEditArtist dlg = new AddEditArtist(true);
                dlg.Owner = this;
                if (dlg.ShowDialog() == true)
                {
                    currAlbumArtist = dlg.ReturnCurrArtist;
                    lblcurrAlbumArtistName.Content = currAlbumArtist.ArtistName;
                    if (currAlbumArtist.Id <= 0)                                   //update GUI Artist info
                    {
                        lblcurrAlbumArtistId.Content = "-";
                    }
                    else
                    {
                        lblcurrAlbumArtistId.Content = currAlbumArtist.Id;
                    }
                }
            }
            catch (SystemException ex)
            {
                MessageBox.Show(ex.Message, "Database operation failed", MessageBoxButton.OK, MessageBoxImage.Warning);
            }
            
            
        }
        private void RefreshGUI()   //refresh listview, clear inputs and set current album and artist to null
        {
            tbAlbumName.Text = "";
            tbAlbumPrice.Text = "";
            lblAlbumID.Content = "-";
            dpAlbumReleaseDate.SelectedDate = null;
            lblcurrAlbumArtistId.Content = "-";
            lblcurrAlbumArtistName.Content = "";
            lvAlbums.SelectedIndex = -1;
            albumList = manip.RetrieveAllAlbums();
            lvAlbums.ItemsSource = albumList;
            btDelete.IsEnabled = false;
        }

        private void btAddEditAlbum_Click(object sender, RoutedEventArgs e)
        {
            try
            {
                if (!ValidateAlbum(tbAlbumName.Text, tbAlbumPrice.Text)) { return; }  //validation of inputs
                string albumName = tbAlbumName.Text;
                decimal albumPrice = decimal.Parse(tbAlbumPrice.Text);
                DateTime releaseDate = (DateTime)dpAlbumReleaseDate.SelectedDate;
                if (referenceOnly)    //window was called to return new or existing album back to caller
                {
                    if (currAlbum == null)
                    {
                        currAlbum = new Album { AlbumName = albumName, AlbumPrice = albumPrice, ReleaseDate = releaseDate, ArtistId = 0 };
                    }
                    DialogResult = true;
                    return;
                }
                if (currAlbum == null && currAlbumArtist.Id <= 0)       //NEW ALBUM AND NEW ARTIST
                {
                    manip.AddArtist(currAlbumArtist);
                    DBConnection.ctx.SaveChanges();                 
                    int useableArtistId = manip.LatestArtistID();
                    Album newAlbum = new Album { AlbumName = albumName, AlbumPrice = albumPrice, ReleaseDate = releaseDate, ArtistId = useableArtistId };
                    DBConnection.ctx.Albums.Add(newAlbum);
                }
                else if (currAlbum == null && currAlbumArtist.Id > 0)  //NEW ALBUM PREVIOUS ARTIST
                {
                    Album newAlbum = new Album { AlbumName = albumName, AlbumPrice = albumPrice, ReleaseDate = releaseDate, ArtistId = currAlbumArtist.Id };
                    DBConnection.ctx.Albums.Add(newAlbum);
                }
                else                                                    //UPDATING OLD ALBUM
                {
                    currAlbum.AlbumName = albumName;
                    currAlbum.AlbumPrice = albumPrice;
                    currAlbum.ReleaseDate = releaseDate;
                }
                DBConnection.ctx.SaveChanges();
                RefreshGUI();
            }
            catch (SystemException ex)
            {
                MessageBox.Show(ex.Message, "Database operation failed", MessageBoxButton.OK, MessageBoxImage.Warning);
            }
            
        }

        private bool ValidateAlbum(string albumName, string priceString)  //method to verify user inputs
        {
            List<string> errorList = new List<string>();
            if (currAlbumArtist == null && referenceOnly == false)
            {
                errorList.Add("No artist selected, albums must be associated with an artist");
            }
            if (dpAlbumReleaseDate.SelectedDate == null)
            {
                errorList.Add("Invalid release date, a date between 1850 and the current date must be provided");
            }
            else
            {
                DateTime releaseDate = (DateTime)dpAlbumReleaseDate.SelectedDate;
                if (releaseDate.Year < 1850 || releaseDate > DateTime.Now)
                {
                    errorList.Add("Invalid release date, a date between 1850 and the current date must be provided");
                }

            }
            if (albumName.Length < 1 || albumName.Length > 60)
            {
                errorList.Add("Invalid album name album name must be between 1 and 60 characters");
            }
            if (!decimal.TryParse(priceString, out decimal albumPrice))
            {
                errorList.Add("Invalid album price, album price must be a number between 0 and 500");

            }
            else if (albumPrice < 0 || albumPrice > 500)
            {
                errorList.Add("Invalid album price album price must be a number between 0 and 500");
            }
            if (errorList.Count() > 0)
            {
                MessageBox.Show("Please fix following issues before proceding:\n\n-" + string.Join("\n\n-", errorList), "Input Issue(s)", MessageBoxButton.OK, MessageBoxImage.Information);
                return false;
            }
            return true;
        }

        private void btDelete_Click(object sender, RoutedEventArgs e)
        {
            try
            {
                if (MessageBox.Show("Are you sure you want to delete selected album: " + currAlbum.AlbumName, "Warning", MessageBoxButton.YesNo, MessageBoxImage.Warning) == MessageBoxResult.Yes && currAlbum != null)
                {
                    DBConnection.ctx.Albums.Remove(currAlbum);
                    DBConnection.ctx.SaveChanges();
                    RefreshGUI();
                }
            }
            catch (DbUpdateException ex)
            {
                MessageBox.Show("Delete aborted because information from this album is used by other parts of the Database", "Invalid Action", MessageBoxButton.OK, MessageBoxImage.Warning);
            }
            catch (SystemException ex)
            {
                MessageBox.Show(ex.Message, "Database operation failed", MessageBoxButton.OK, MessageBoxImage.Warning);
            }
        }
    }
}
