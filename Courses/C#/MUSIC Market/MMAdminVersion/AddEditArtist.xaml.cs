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
    /// Interaction logic for AddEditArtist.xaml
    /// </summary>
    public partial class AddEditArtist : Window
    {
        DBConnection ctx = new DBConnection();
        ManipulateDB manip = new ManipulateDB();
        List<Artist> artistList = new List<Artist>();
        private Artist currArtist;
        bool refernceOnly;

        public Artist ReturnCurrArtist
        {
            get { return currArtist; }
        }

        public AddEditArtist(bool CalledForReference = false)
        {
            try
            {
                InitializeComponent();
                refernceOnly = CalledForReference; //Window called to return artist OR for DB operation
                btAddUpdateArtist.Content = refernceOnly ? "Select" : "Add";
                artistList = manip.RetrieveAllArtists();  //fetch artits and populate listview
                lvArtist.ItemsSource = artistList;
            }
            catch (SystemException ex)
            {
                MessageBox.Show(ex.Message, "Database operation failed", MessageBoxButton.OK, MessageBoxImage.Warning);
            }
            
        }

        private void lvArtist_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {
            if(lvArtist.SelectedIndex == -1)
            {
                RefreshGUI();
                return;
            }
            currArtist = (Artist)lvArtist.SelectedItem;  //update current selected artist
            lblArtistId.Content = currArtist.Id;
            tbArtistName.Text = currArtist.ArtistName;
            btDeleteArtist.IsEnabled = true;
            btAddUpdateArtist.Content = refernceOnly == true ? "Select" : "Update";
        }
        private void RefreshGUI()          //reset GUI, current artist and refresh listview
        {
            currArtist = null;
            lblArtistId.Content = "-";
            tbArtistName.Text = "";
            artistList = manip.RetrieveAllArtists();
            lvArtist.ItemsSource = artistList;
            lvArtist.SelectedIndex = -1;
            btDeleteArtist.IsEnabled = false;
            btAddUpdateArtist.Content = refernceOnly == true ? "Select" : "Add";
            lvArtist.Items.Refresh();
        }

        private void btAddUpdateArtist_Click(object sender, RoutedEventArgs e)
        {
            try
            {
                if (!ValidateArtist(tbArtistName.Text)) { return; }
                if (refernceOnly == true)   //Window was called to return artist to another dialog without updating DB
                {
                    if (currArtist != null)  //return existing artist
                    {
                        if (lvArtist.SelectedIndex == -1) { return; }
                        DialogResult = true;
                        return;
                    }
                    else                   //return new artist
                    {
                        currArtist = new Artist { ArtistName = tbArtistName.Text };
                        DialogResult = true;
                        return;
                    }

                }
                if (currArtist == null)  //add new artist to DB
                {
                    Artist newArtist = new Artist { ArtistName = tbArtistName.Text };
                    DBConnection.ctx.Artists.Add(newArtist);
                }
                else                  //update existing artist
                {
                    currArtist.ArtistName = tbArtistName.Text;
                }
                DBConnection.ctx.SaveChanges();
                RefreshGUI();
            }
            catch (SystemException ex)
            {
                MessageBox.Show(ex.Message, "Database operation failed", MessageBoxButton.OK, MessageBoxImage.Warning);
            }
            
        }

        private bool ValidateArtist(string artistName)
        {
            if (artistName.Length < 1 || artistName.Length > 60)
            {
                MessageBox.Show("Artist name is invalid name must be 1 to 65 characters", "Input Error", MessageBoxButton.OK, MessageBoxImage.Information);
                return false;
            }
            return true;
        }

        private void btDeleteArtist_Click(object sender, RoutedEventArgs e)
        {
            try
            {
                if (MessageBox.Show("Are you sure you want to delete selected artist: " + currArtist.ArtistName, "Warning", MessageBoxButton.YesNo, MessageBoxImage.Warning) == MessageBoxResult.Yes)
                {
                    if (currArtist != null)
                    {
                        DBConnection.ctx.Artists.Remove(currArtist);
                        DBConnection.ctx.SaveChanges();
                        RefreshGUI();
                    }
                }
            }
            catch (DbUpdateException ex)
            {
                MessageBox.Show("Delete aborted because information from this artist is used by other parts of the Database", "Invalid Action", MessageBoxButton.OK, MessageBoxImage.Warning);
            }
            catch (SystemException ex)
            {
                MessageBox.Show(ex.Message, "Database operation failed", MessageBoxButton.OK, MessageBoxImage.Warning);
            }
        }
    }
}
