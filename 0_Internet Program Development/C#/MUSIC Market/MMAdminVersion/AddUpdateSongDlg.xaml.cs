using Microsoft.Win32;
using MMLibrary;
using System;
using System.Collections.Generic;
using System.Data.Entity.Infrastructure;
using System.IO;
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
    
    public partial class AddUpdateSongDlg : Window
    {
        DBConnection ctx = new DBConnection();
        MMLibrary.ManipulateDB manip = new ManipulateDB();
        UtilsAndResources util = new UtilsAndResources();
        byte[] currSongData;
        private Song currSong;
        private Artist currArtist;
        private Album currAlbum;
        List<Song> songList = new List<Song>();
        public AddUpdateSongDlg()
        {
            try
            {
                InitializeComponent();
                songList = manip.RetrieveAllSongs();
                lvSongs.ItemsSource = songList;
                comboGenre.ItemsSource = util.GetGenres();
            }
            catch (SystemException ex)
            {
                MessageBox.Show(ex.Message, "Database operation failed", MessageBoxButton.OK, MessageBoxImage.Warning);
            }
            
        }

        private void btSelectSongData_Click(object sender, RoutedEventArgs e)
        {
            try
            {
                OpenFileDialog dlg = new OpenFileDialog();
                if (dlg.ShowDialog() == true)
                {
                    currSongData = File.ReadAllBytes(dlg.FileName);
                    lblDataSrc.Background = new SolidColorBrush(Colors.SpringGreen);
                }
            }
            catch (SystemException ex)
            {
                MessageBox.Show(ex.Message, "Database operation failed", MessageBoxButton.OK, MessageBoxImage.Warning);
            }
            
        }


        private void lvSongs_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {
            if(lvSongs.SelectedIndex == -1)
            {
                currSong = null;
                RefreshGUI();
                return;
            }
            currSongData = null;
            btAddEditSong.Content = "Update";
            currSong = (Song)lvSongs.SelectedItem;
            btDeleteSong.IsEnabled = true;
            lblSongId.Content = currSong.Id;
            currArtist = currSong.Artist;
            currAlbum = currSong.Album;
            tbSongName.Text = currSong.SongName;
            tbSongPrice.Text = currSong.SongPrice.ToString();
            comboGenre.SelectedItem = currSong.Genre;
            lblArtistId.Content = currArtist.Id;
            lblArtistName.Content = currArtist.ArtistName;
            lblDataSrc.Background = new SolidColorBrush(Colors.SpringGreen);
            if (currAlbum != null)
            {
                lblAlbumID.Content = currAlbum.Id;
                lblAlbumName.Content = currAlbum.AlbumName;
                lblAlbumPrice.Content = currAlbum.AlbumPrice.ToString();
                lblAlbumDate.Content = currAlbum.ReleaseDate;
            }
        }

        private void RefreshGUI()
        {
            btAddEditSong.Content = "Add";
            currSong = null;
            currArtist = null;
            currSongData = null;
            currAlbum = null;
            btDeleteSong.IsEnabled = false;
            tbSongName.Text = "";
            tbSongPrice.Text = "";
            lblSongId.Content = "-";
            lblArtistId.Content = "-";
            lblArtistName.Content = "-";
            lblAlbumDate.Content = "-";
            lblAlbumID.Content = "-";
            lblAlbumName.Content = "-";
            lblAlbumPrice.Content = "-";
            comboGenre.SelectedIndex = 0;
            lblDataSrc.Background = new SolidColorBrush(Colors.LightSalmon);
            songList = manip.RetrieveAllSongs();
            lvSongs.ItemsSource = songList;
            lvSongs.SelectedIndex = -1;
        }

        private void btAddArtistForSong_Click(object sender, RoutedEventArgs e)
        {
            try
            {
                AddEditArtist dlg = new AddEditArtist(true);
                dlg.Owner = this;
                if (dlg.ShowDialog() == true)
                {
                    currArtist = dlg.ReturnCurrArtist;
                    lblArtistName.Content = currArtist.ArtistName;
                    if (currArtist.Id <= 0)
                    {
                        lblArtistId.Content = "-";
                    }
                    else
                    {
                        lblArtistId.Content = currArtist.Id;
                    }
                }
            }
            catch (SystemException ex)
            {
                MessageBox.Show(ex.Message, "Database operation failed", MessageBoxButton.OK, MessageBoxImage.Warning);
            }
            
        }

        private void btAddAlbumForSong_Click(object sender, RoutedEventArgs e)
        {
            try
            {
                AddEditAlbum dlg = new AddEditAlbum(true);
                dlg.Owner = this;
                if (dlg.ShowDialog() == true)
                {
                    currAlbum = dlg.ReturnCurrAlbum;
                    if (dlg.ReturnCurrArtist != null) { currArtist = dlg.ReturnCurrArtist; }
                    lblAlbumName.Content = currAlbum.AlbumName;
                    lblAlbumPrice.Content = currAlbum.AlbumPrice;
                    lblAlbumDate.Content = currAlbum.ReleaseDate;
                    if (currAlbum.Id > 0)
                    {
                        lblArtistId.Content = currArtist.Id;
                        lblArtistName.Content = currArtist.ArtistName;
                        lblAlbumName.Content = currAlbum.AlbumName;
                        lblAlbumID.Content = currAlbum.Id;
                    }
                    else
                    {
                        lblAlbumID.Content = "-";
                    }
                }
            }
            catch (SystemException ex)
            {
                MessageBox.Show(ex.Message, "Database operation failed", MessageBoxButton.OK, MessageBoxImage.Warning);
            }
        }

        private void btAddEditSong_Click(object sender, RoutedEventArgs e)
        {
            if (!ValidateSong(tbSongName.Text, tbSongPrice.Text, currArtist, currSongData, currSong)) { return; } //validate inputs
            string songName = tbSongName.Text;
            decimal songPrice = decimal.Parse(tbSongPrice.Text);
            string genre = comboGenre.Text;

            Song newSong = new Song { SongName = songName, SongPrice = songPrice, Genre = genre};
            if (lvSongs.SelectedIndex != -1)  // UPDATE EXISTING SONG
            {
                currSong.SongName = songName;
                currSong.SongPrice = songPrice;
                currSong.Genre = genre;
                if(currSongData != null)  //update song mp3 if new file selected
                {
                    SongData oldData = (from songdat in DBConnection.ctx.SongDatas where songdat.SongId == currSong.Id select songdat).FirstOrDefault();
                    oldData.SongBytes = currSongData;
                }
                MessageBox.Show("UPDATE");
                DBConnection.ctx.SaveChanges();
                RefreshGUI();
                return;
            }
            else if (currAlbum != null && currAlbum.Id <= 0 && //NEW SONG ARTIST and ALBUM
                currArtist != null && currArtist.Id <= 0)
            {
                Album newAlbum = new Album { AlbumName = currAlbum.AlbumName, AlbumPrice = currAlbum.AlbumPrice, ReleaseDate = currAlbum.ReleaseDate };
                DBConnection.ctx.Artists.Add(currArtist);
                DBConnection.ctx.SaveChanges();
                int useableArtistId = manip.LatestArtistID();
                newAlbum.ArtistId = useableArtistId;
                DBConnection.ctx.Albums.Add(newAlbum);
                DBConnection.ctx.SaveChanges();
                int useableAlbumId = manip.LatestAlbumID();
                newSong.ArtistId = useableArtistId;
                newSong.AlbumId = useableAlbumId;
                DBConnection.ctx.Songs.Add(newSong);
                DBConnection.ctx.SaveChanges();
                MessageBox.Show("ALL NEW");
            }
            else if (currAlbum != null && currAlbum.Id > 0) // NEW SONG ONLY
            {
                newSong.ArtistId = currArtist.Id;
                newSong.AlbumId = currAlbum.Id;
                DBConnection.ctx.Songs.Add(newSong);
                DBConnection.ctx.SaveChanges();
                MessageBox.Show("SONG ONLY");
            }
            else if ( currAlbum != null && currAlbum.Id <= 0 && currArtist.Id > 0) // NEW SONG and ALBUM
            {
                Album newAlbum = new Album { AlbumName = currAlbum.AlbumName, AlbumPrice = currAlbum.AlbumPrice, ReleaseDate = currAlbum.ReleaseDate };
                newAlbum.ArtistId = currArtist.Id;
                DBConnection.ctx.Albums.Add(newAlbum);
                DBConnection.ctx.SaveChanges();
                int useableAlbumId = manip.LatestAlbumID();
                newSong.ArtistId = currArtist.Id;
                newSong.AlbumId = useableAlbumId;
                DBConnection.ctx.Songs.Add(newSong);
                DBConnection.ctx.SaveChanges();
                MessageBox.Show("SONG ALBUM");
            }
            else if(currArtist != null && currArtist.Id <= 0 && currAlbum == null) //NEW SONG and ARTIST
            {
                DBConnection.ctx.Artists.Add(currArtist);
                DBConnection.ctx.SaveChanges();
                int useableArtistId = manip.LatestArtistID();
                newSong.ArtistId = useableArtistId;
                DBConnection.ctx.Songs.Add(newSong);
                DBConnection.ctx.SaveChanges();
                MessageBox.Show("SONG ARTIST");
            }
            else                                                                  //NEW SONG EXISTING ARTIST
            {
                MessageBox.Show(currArtist.Id.ToString());
                newSong.ArtistId = currArtist.Id;
                DBConnection.ctx.Songs.Add(newSong);
                MessageBox.Show("NEW SONG OLD ARTIST");
                DBConnection.ctx.SaveChanges();
            }
            SongData sd = new SongData { SongBytes = currSongData, SongId = manip.LatestSongID() };
            DBConnection.ctx.SongDatas.Add(sd);
            DBConnection.ctx.SaveChanges();
            RefreshGUI();
        }

        private bool ValidateSong(string songName, string priceString, Artist currentArtist, byte[] songData, Song song)
        {
            List<string> errorList = new List<string>();
            if (currentArtist == null)
            {
                errorList.Add("No artist selected, a song must be associated with an artist");
            }
            if (songData == null && currSong == null)
            {
                errorList.Add("No mp3 song data selected, please select an mp3 file from hard drive");
            }
            if (songName.Length < 1 || songName.Length > 60)
            {
                errorList.Add("Invalid song name song name must be between 1 and 60 characters");
            }
            if (!decimal.TryParse(priceString, out decimal songPrice))
            {
                errorList.Add("Invalid song price, song price must be a number between 0 and 100");

            }
            else if (songPrice < 0 || songPrice > 100)
            {
                errorList.Add("Invalid song price, song price must be a number between 0 and 100");
            }
            if (errorList.Count() > 0)
            {
                MessageBox.Show("Please fix following issues before proceding:\n\n-" + string.Join("\n\n-", errorList), "Input Issue(s)", MessageBoxButton.OK, MessageBoxImage.Information);
                return false;
            }
            return true;
        }

        private void btDeleteSong_Click(object sender, RoutedEventArgs e)
        {
            try
            {
                if (MessageBox.Show("Are you sure you want to delete the following song: " + currSong.SongName + "?", "Warning", MessageBoxButton.YesNo, MessageBoxImage.Warning) == MessageBoxResult.Yes)
                {
                    SongData oldData = (from sd in DBConnection.ctx.SongDatas where sd.SongId == currSong.Id select sd).FirstOrDefault();
                    DBConnection.ctx.SongDatas.Remove(oldData);
                    DBConnection.ctx.Songs.Remove(currSong);
                    DBConnection.ctx.SaveChanges();
                    RefreshGUI();
                }
            }
            catch (DbUpdateException ex)
            {
                MessageBox.Show("Delete aborted because information from this song is used by other parts of the Database", "Invalid Action", MessageBoxButton.OK, MessageBoxImage.Warning);
            }
            catch (SystemException ex)
            {
                MessageBox.Show(ex.Message, "Database operation failed", MessageBoxButton.OK, MessageBoxImage.Warning);
            }


        }
    }
}
