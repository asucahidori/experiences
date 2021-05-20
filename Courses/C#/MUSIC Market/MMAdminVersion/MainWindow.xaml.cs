using Microsoft.Win32;
using MMLibrary;
using Plugin.SimpleAudioPlayer;
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
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace MMAdminVersion
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        DBConnection ctx = new DBConnection();
        ManipulateDB manip = new ManipulateDB();
        public MainWindow()
        {
            InitializeComponent();
        }

        private void btAddEditSong_Click(object sender, RoutedEventArgs e)
        {
            AddUpdateSongDlg dlg = new AddUpdateSongDlg();
            dlg.Owner = this;
            dlg.ShowDialog();
        }

        private void btAddArtist_Click(object sender, RoutedEventArgs e)
        {
            AddEditArtist dlg = new AddEditArtist();
            dlg.Owner = this;
            dlg.ShowDialog();
        }

        private void btAddEditAlbum_Click(object sender, RoutedEventArgs e)
        {
            AddEditAlbum dlg = new AddEditAlbum();
            dlg.Owner = this;
            dlg.ShowDialog();
        }

        private void Button_Click(object sender, RoutedEventArgs e)
        {
            SortsAndFilters sf = new SortsAndFilters();
            List<Song> songList = sf.RetrieveNotOwnedSongs(1);
            List<string> songNames = new List<string>();
            foreach (Song s in songList)
            {
                songNames.Add(s.SongName);
            }
            MessageBox.Show(string.Join("---", songNames));
            
        }

        private void btManageUsers_Click(object sender, RoutedEventArgs e)
        {
            ManageUsersWindow dlg = new ManageUsersWindow();
            dlg.Owner = this;
            dlg.ShowDialog();
        }
    }
}
