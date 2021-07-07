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
    /// Interaction logic for ManageUsersWindow.xaml
    /// </summary>
    public partial class ManageUsersWindow : Window
        
    {
        DBConnection ctx = new DBConnection();
        SortsAndFilters sortFil = new SortsAndFilters();
        ManipulateDB manip = new ManipulateDB();
        List<User> userList = new List<User>();
        List<string> infoList = new List<string>();
        int reason = 1;
        User currUser;
        public ManageUsersWindow()
        {
            try
            {
                InitializeComponent();
                userList = (from user in DBConnection.ctx.Users select user).ToList();
                lvUsers.ItemsSource = userList;
                lvInfoDisplay.ItemsSource = infoList;
                lblTotalSalesAll.Content = "$ " + AllSalesAmount(userList);
                lblMostSongAll.Content = MostListenedSongs(0);
                lblMostArtAll.Content = MostListenedArtist(0);
            }
            catch (SystemException ex)
            {
                MessageBox.Show(ex.Message, "Database operation failed", MessageBoxButton.OK, MessageBoxImage.Warning);
            }
            
        }

        private void lvUsers_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {
            if (lvUsers.SelectedIndex == -1) {
                RefreshGUI();
                return;
            }
            currUser = (User)lvUsers.SelectedItem;
            currUser.Valid = (from user in DBConnection.ctx.Users where user.Id == currUser.Id select user.Valid).FirstOrDefault();
            UpdatePlayInfo(reason);
            lblTotalSalesUser.Content = "$ " + UserTotalSales(currUser.CustomerId);
            lblMostSongUser.Content = MostListenedSongs(currUser.CustomerId);
            lblMostArtUser.Content = MostListenedArtist(currUser.CustomerId);
            btListeningHist.IsEnabled = false;
            btTransacHist.IsEnabled = true;
            btUserSongs.IsEnabled = true;
            btAccountStauts.IsEnabled = true;
            btAccountStauts.Background = currUser.Valid == true ? new SolidColorBrush(Colors.SpringGreen) : new SolidColorBrush(Colors.LightSalmon);
            btAccountStauts.Content = currUser.Valid == true ? "Account Enabled" : "Account Disabled";
            tbPassowrd.Text = currUser.UserPassword;
            btDeleteUser.IsEnabled = true;
            btSaveChanges.IsEnabled = true;
        }

        private void UpdatePlayInfo(int reason)
        {
            try
            {
                infoList.Clear();
                switch (reason)
                {
                    case 1:
                        List<ListeningRecord> listeningRecord = sortFil.RetrieveUseageInfo(currUser.CustomerId);
                        foreach (ListeningRecord record in listeningRecord)
                        {
                            infoList.Add($"{record.DateOf.ToString("d")}{" :  "}{ record.Song.SongName}{" by "}{record.Song.Artist.ArtistName}");
                        }
                        if (infoList.Count() <= 0)
                        {
                            infoList.Add("No Listening Records To Date");
                        }
                        break;
                    case 2:
                        List<Transaction> transactions = sortFil.RetrieveTransactions(currUser.CustomerId);
                        foreach (Transaction trans in transactions)
                        {
                            infoList.Add(trans.TransactionDate.ToString("d") + " : ");
                            decimal transactionTotal = 0;
                            foreach (Song song in trans.Songs)
                            {
                                infoList.Add($"{ "   -"}{ song.SongName}{" by "}{song.Artist.ArtistName}");
                                transactionTotal += song.SongPrice;
                            }
                            infoList.Add($"{"   Total: $"}{transactionTotal}{"\n------------------------------------"}");
                        }
                        if (infoList.Count() <= 0)
                        {
                            infoList.Add("No Transactions To Date");
                        }
                        break;
                    case 3:
                        List<Song> songList = sortFil.RetrieveOwnedSongs(currUser.CustomerId);
                        foreach (Song song in songList)
                        {
                            string albumName = "";
                            if (song.Album != null)
                            {
                                albumName = " Album: " + song.Album.AlbumName;
                            }
                            infoList.Add($"{song.SongName}{" by "}{song.Artist.ArtistName}");
                        }
                        if (infoList.Count() <= 0)
                        {
                            infoList.Add("No Songs Owned");
                        }
                        break;
                    default:
                        break;

                }
                lvInfoDisplay.Items.Refresh();
            }
            catch (SystemException ex)
            {
                MessageBox.Show(ex.Message, "Database operation failed", MessageBoxButton.OK, MessageBoxImage.Warning);
            }
            
        }

        private void ToggleReason(Button sender)
        {
            if (sender.Name == "btListeningHist")
            {
                reason = 1;
                btListeningHist.IsEnabled = false;
                btTransacHist.IsEnabled = true;
                btUserSongs.IsEnabled = true;
            }
            else if (sender.Name == "btTransacHist")
            {
                reason = 2;
                btTransacHist.IsEnabled = false;
                btListeningHist.IsEnabled = true;
                btUserSongs.IsEnabled = true;
            }
            else if (sender.Name == "btUserSongs")
            {
                reason = 3;
                btUserSongs.IsEnabled = false;
                btListeningHist.IsEnabled = true;
                btTransacHist.IsEnabled = true;
            }
        }

        private void btDisplayToggle_Click(object sender, RoutedEventArgs e)
        {
            ToggleReason((Button)sender);
            UpdatePlayInfo(reason);
        }

        private decimal UserTotalSales(int customerId)
        {
            decimal totalUserSales = sortFil.RetrieveOwnedSongs(customerId).Sum(x => x.SongPrice);
            return totalUserSales;
        }

        private decimal AllSalesAmount(List<User> userList)
        {
            decimal allSales = 0;
            foreach (User u in userList) {
                allSales += sortFil.RetrieveOwnedSongs(u.CustomerId).ToList<Song>().Sum(x => x.SongPrice);
            }
            return allSales;
        }
        private string MostListenedSongs(int userId)
        {
            string mostSong = "-";
            List<int> mostListenedSong = new List<int>();
            if (userId > 0)
            {
                mostListenedSong = sortFil.RetrieveUseageInfo(userId).ToList<ListeningRecord>().GroupBy(x => x.Song.Id).OrderByDescending(x => x.Count()).Select(x => x.Key).ToList();
            }
            else
            {
                mostListenedSong = DBConnection.ctx.ListeningRecords.ToList<ListeningRecord>().GroupBy(x => x.Song.Id).OrderByDescending(x => x.Count()).Select(x => x.Key).ToList();
            }
            int songId = mostListenedSong.FirstOrDefault();
            if (songId > 0)
            {
                mostSong = (from song in DBConnection.ctx.Songs where song.Id == songId select song.SongName).FirstOrDefault();
            }
            return mostSong;
        }

        private string MostListenedArtist(int userId)
        {
            string mostArtist = "-";
            List<int> mostListenedArtist = new List<int>();
            if (userId > 0)
            {
                mostListenedArtist = sortFil.RetrieveUseageInfo(userId).ToList<ListeningRecord>().GroupBy(x => x.Song.Artist.Id).OrderByDescending(x => x.Count()).Select(x => x.Key).ToList();
            }
            else
            {
                mostListenedArtist = DBConnection.ctx.ListeningRecords.ToList<ListeningRecord>().GroupBy(x => x.Song.Artist.Id).OrderByDescending(x => x.Count()).Select(x => x.Key).ToList();
            }
            int artistId = mostListenedArtist.FirstOrDefault();
            if (artistId > 0)
            {
                mostArtist = (from artist in DBConnection.ctx.Artists where artist.Id == artistId select artist.ArtistName).FirstOrDefault();
            }
            return mostArtist;
        }

        private void btDeleteUser_Click(object sender, RoutedEventArgs e)
        {
            try
            {
                if (MessageBox.Show("Are you sure you wan to delte selected user: " + currUser.UserName + "?", "Warning", MessageBoxButton.YesNo, MessageBoxImage.Warning) == MessageBoxResult.Yes && currUser != null)
                {
                    manip.DeleteUser(currUser.Id);
                    RefreshGUI();
                }
            }
            catch (DbUpdateException ex)
            {
                MessageBox.Show("Delete aborted because information from this user is used by other parts of the Database you can still disable the account to prevent access", "Invalid Action", MessageBoxButton.OK, MessageBoxImage.Warning);
            }
            
        }

        private void RefreshGUI()
        {
            currUser = null;
            infoList.Clear();
            lvInfoDisplay.Items.Refresh();
            lblTotalSalesUser.Content = "-";
            lblMostSongUser.Content = "-";
            lblMostArtUser.Content = "-";
            btListeningHist.IsEnabled = false;
            btTransacHist.IsEnabled = false;
            btUserSongs.IsEnabled = false;
            btAccountStauts.IsEnabled = false;
            btDeleteUser.IsEnabled = false;
            btSaveChanges.IsEnabled = false;
            userList = (from user in DBConnection.ctx.Users select user).ToList();
            lvUsers.ItemsSource = userList;
            tbPassowrd.Text = "";
            lvUsers.SelectedIndex = -1;
        }

        private void btAccountStauts_Click(object sender, RoutedEventArgs e)
        {
            if(currUser.Valid == true)
            {
                currUser.Valid = false;
            }
            else
            {
                currUser.Valid = true;
            }
            btAccountStauts.Background = currUser.Valid == true ? new SolidColorBrush(Colors.SpringGreen) : new SolidColorBrush(Colors.LightSalmon);
            btAccountStauts.Content = currUser.Valid == true ? "Account Enabled" : "Account Disabled";
        }

        private void btSaveChanges_Click(object sender, RoutedEventArgs e)
        {
            currUser.UserPassword = tbPassowrd.Text;
            DBConnection.ctx.SaveChanges();
            RefreshGUI();
        }
    }
}
