using Microsoft.Win32;
using MMLibrary;
using System;
using System.Collections.Generic;
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

namespace MMCustomerVersion
{
    /// <summary>
    /// Interaction logic for UsersMainWindow.xaml
    /// </summary>
    public partial class UsersMainWindow : Window
    {
        //init
        public  Song selectedItem;
        private  List<Song> CartList;
        //User infomation from the loginIn Page
        private User user;
        private Album album;
        private Artist artist;
        private bool isAddToCart = true;
        private String DefaultPath = @"c:\MusicMarkt\temp\";

        //private List<Song> songList = new List<Song>();
        public HashSet<Song> songList = new HashSet<Song>();
        
        //SongData songData;
        public UsersMainWindow(User user)
        {
            InitializeComponent();
            //init
            //lvSongsList.ItemsSource = MMLibrary.DBConnection.ctx.Songs.ToList<Song>();
            shoppingCardImgSet();
            btnInitStatusSet();
            this.user = user;
            windowBackgroundSet();
            //set the UserWindow client
            lblTtile.Content = $"{user.Customer.CustomerName}, welcome to music market!";
            lvSongsList.ItemsSource = (from s in DBConnection.ctx.Songs select s).ToList<Song>();
        }

        private void windowBackgroundSet()
        {
            ImageBrush imgBrush = new ImageBrush();
            imgBrush.ImageSource = new BitmapImage(new Uri(@"..\..\Images\UWbackgroud.jpg", UriKind.Relative));
            imgBrush.TileMode = TileMode.Tile;
            imgBrush.Stretch = Stretch.Fill;
            this.Background = imgBrush;
        }


        private void btnInitStatusSet() 
        {
            btMusicPlay.IsEnabled = false;
            btShopingCard.IsEnabled = false;
            btCheckOut.IsEnabled = false;
        }

        private void lvSearch_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {
            if (lvSongsList.SelectedIndex == -1)
            {
                MessageBox.Show("You need select at least one item.");
                return;
            }

            //btn status change
            btMusicPlay.IsEnabled = true;
            btShopingCard.IsEnabled = true;

            //instance
            selectedItem = lvSongsList.SelectedItem as Song;

            //excute the query
            album = MMLibrary.DBConnection.ctx.Albums.Where(a => a.ArtistId == selectedItem.ArtistId).FirstOrDefault();
            artist = MMLibrary.DBConnection.ctx.Artists.Where(a => a.Id == selectedItem.ArtistId).FirstOrDefault();

            //set the value to the text fields
            //album
            if (album == null)
            {
                tbAlbumName.Text = "";
                tbInfoSongTitle.Text = "";
            }
            else
            {
                tbAlbumName.Text = album.AlbumName;
                tbInfoSongTitle.Text = album.AlbumName;
            }
            //ArtistName
            if (artist == null) 
            {
                tbArtistName.Text = "";
            }
            else
            {
                tbArtistName.Text = artist.ArtistName;
            }
            //SongName can't be null
            tbSongName.Text = selectedItem.SongName;
            tbInfoSongName.Text = selectedItem.SongName;

            //get the picture for albumCover
            ImageBrush myBrush = new ImageBrush();
            string filePath = @"..\..\Images\" + $"{artist.ArtistName}.jpg";
            string defaultFP = @"..\..\Images\default_album.png";
            if (File.Exists(filePath))
            {
                myBrush.ImageSource = new BitmapImage(new Uri(filePath, UriKind.Relative));
            }
            else
            {
                myBrush.ImageSource = new BitmapImage(new Uri(defaultFP, UriKind.Relative));
            }
            //myBrush.ImageSource = new BitmapImage(new Uri(@"..\..\Images\default_album.png", UriKind.Relative));
            myBrush.TileMode = TileMode.Tile;
            myBrush.Stretch = Stretch.Fill;
            lblSongCover.Background = myBrush;

            //judge this song has been paid or not.
            if (user.Customer.Songs.Contains(selectedItem))
            {
                btShopingCard.Content = "Download";
                isAddToCart = false;
            }
            else
            {
                btShopingCard.Content = "Add to Cart";
                isAddToCart = true;
            }
        }

        private void btMusicPlay_Click(object sender, RoutedEventArgs e)
        {
            if (selectedItem == null) 
            {
                MessageBox.Show("You must select one item!");
                return;
            }
            
            MediaPlayerWindow media = new MediaPlayerWindow(selectedItem,user);
            media.Owner = this;
            if (media.ShowDialog() == true)
            {
                MessageBox.Show("Its done!");
            }
        }

        //shoping card method
        //1.shopping card image setting
        private void shoppingCardImgSet() 
        {
            //shopcard backgroud setting
            ImageBrush imgBrush = new ImageBrush();
            imgBrush.ImageSource = new BitmapImage(new Uri(@"..\..\Images\shopping cart.jpg", UriKind.Relative));
            imgBrush.TileMode = TileMode.Tile;
            imgBrush.Stretch = Stretch.Fill;
            lblCardNum.Background = imgBrush;
        }


        private void btShopingCard_Click(object sender, RoutedEventArgs e)
        {
            if (selectedItem != null) 
            {
                songList.Add(selectedItem);
            }

            if (isAddToCart)
            {
                tbSongNum.Text = $" {songList.Count}";
                if (songList.Count > 0)
                {
                    btCheckOut.IsEnabled = true;
                }
            }
            else 
            {
                //download this mp3
                SaveFileDialog sfd = new SaveFileDialog();
                sfd.Filter = "MP3 file (*.mp3)|*.mp3";
                if (sfd.ShowDialog() == true)
                {
                    //String DefaultFileName = @"c:\MusicMarkt\temp\";
                    SongData songData = DBConnection.ctx.SongDatas.Where(sd => sd.SongId == selectedItem.Id).FirstOrDefault();
                    //read
                    Byte[] mp3Data = songData.SongBytes;
                    using (FileStream fS = new FileStream(sfd.FileName, FileMode.OpenOrCreate, FileAccess.ReadWrite))
                    {
                        fS.Write(mp3Data, 0, mp3Data.Length);
                        fS.Close();
                    }
                    MessageBox.Show($"Selected song {selectedItem.SongName} has been saved!");
                }
            }
        }

        private void btCheckOut_Click(object sender, RoutedEventArgs e)
        {
            //step 1: judge the shopping card number(not less than 1)
            if (songList.Count < 1)
            {
                MessageBox.Show("There is no song in the shopping card!");
                return;
            }
            //step 2: convert HashSet to List for transfering to payment
            CartList = songList.ToList<Song>();

            //step 3: transfer the shopping card List<Song> to payment
            WizardWindow wizardWindow = new WizardWindow(CartList, user);
            wizardWindow.Owner = this;

            //step 4: got the payment result, prepare to download the paid song list 
            //if (wizardWindow.ShowDialog() == true)
            //{
            //    //get the paid list

            //    //download mp3
            //    //SaveFileDialog sfd = new SaveFileDialog();
            //    //sfd.Filter = "MP3 file (*.mp3)|*.mp3";

            //    //wizardWindow.paidList.forEach()...
            //    if (wizardWindow.paidList.Count < 1)
            //    {
            //        MessageBox.Show("There is no any paid song!");
            //        return;
            //    }
            //    //get the song byte[] data
                
            //    wizardWindow.paidList.ForEach(s =>
            //    {
            //        //String DefaultPath = @"c:\MusicMarkt\temp\";
            //        String DefaultFileName = @"c:\MusicMarkt\temp\" + s.SongName + ".mp3";
            //        //
            //        if (!File.Exists(DefaultPath)) 
            //        {
            //            Directory.CreateDirectory(DefaultPath);
            //        }

            //        //String DefaultFileName = @"c:\MusicMarkt\temp\";
            //        SongData songData = DBConnection.ctx.SongDatas.Where(sd => sd.SongId == s.Id).FirstOrDefault();
            //        //read
            //        Byte[] mp3Data = songData.SongBytes;
            //        using (FileStream fS = new FileStream(DefaultFileName, FileMode.OpenOrCreate, FileAccess.ReadWrite))
            //        {
            //            fS.Write(mp3Data, 0, mp3Data.Length);
            //            fS.Close();
            //        }
            //    }
            //    );
            //    MessageBox.Show("Paid songs have been saved!");
            //}
        }
    }
}
