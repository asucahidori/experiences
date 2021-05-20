using MMLibrary;
using Plugin.SimpleAudioPlayer;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Controls.Primitives;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Shapes;
using System.Windows.Threading;

namespace MMCustomerVersion
{
    /// <summary>
    /// Interaction logic for MediaPlayerWindow.xaml
    /// </summary>
    public partial class MediaPlayerWindow : Window
    {
        private MediaPlayer mediaPlayer = new MediaPlayer();
        private bool userIsDraggingSlider = false;
        private SongData songData;
        private Song song;
        private User user;
        private static int index;
        public GifImage gifImage;
        private AudioActions audAct = new AudioActions();
        

        public MediaPlayerWindow(Song song,User user)
        {
            InitializeComponent();
            this.song = song;
            this.user = user;
            audAct.player.Volume = 40;
            loadMP3Data();
            MediaBackgroudSet();
            TimerDefinition();
            saveListeningRecord();
        }
        //save the mp3 data
        private void saveListeningRecord()
        {
            DateTime dateOf = DateTime.Now;
            DBConnection.ctx.ListeningRecords.Add(new ListeningRecord { DateOf = dateOf, CustomerId = user.CustomerId, SongId = song.Id });
            DBConnection.ctx.SaveChanges(); 
        }

        //load the mp3 data
        private void loadMP3Data() 
        { 
            songData = DBConnection.ctx.SongDatas.Where(s => s.SongId == song.Id).FirstOrDefault();
        }

        //method: load the mp3 from memory stream
        public bool Load(Stream audioStream)
        {
            if (mediaPlayer != null)
            {
                var fileName = System.IO.Path.Combine(Environment.GetFolderPath(Environment.SpecialFolder.MyMusic), $"{++index}.wav");
                using (var fileStream = File.OpenWrite(fileName)) audioStream.CopyTo(fileStream);
                mediaPlayer.Open(new Uri(fileName));
                //mediaPlayer.MediaEnded += OnPlaybackEnded; //media loop
            }
            return mediaPlayer != null && mediaPlayer.Source != null;
        }

        //TimerDefinition
        private void TimerDefinition()
        {
            //timer defination
            DispatcherTimer timer = new DispatcherTimer();
            timer.Interval = TimeSpan.FromSeconds(1);
            timer.Tick += timer_Tick;
            timer.Start();
        }

        private void timer_Tick(object sender, EventArgs e)
        {
            if ((mediaPlayer.Source != null) && (mediaPlayer.NaturalDuration.HasTimeSpan) && (!userIsDraggingSlider))
            {
                sliProgress.Minimum = 0;
                //sliProgress.Maximum = audAct.player.Duration;
                //sliProgress.Value = audAct.player.CurrentPosition;
                sliProgress.Maximum = mediaPlayer.NaturalDuration.TimeSpan.TotalSeconds;
                sliProgress.Value = mediaPlayer.Position.TotalSeconds;
            }
        }

        //mediaplayer backgroud
        private void MediaBackgroudSet() 
        {
            //picture backgroud choose
            gifImage = new GifImage(@"..\..\Images\audio_background.gif");
            lblStatus.Content = gifImage;
            //header set
            if (song.Album == null)
            {
                lblAlbum.Content = "      ";
            }
            else
            {
                lblAlbum.Content = $"     Album [{song.Album.AlbumName}]  ";
            }
            if (song.Artist== null)
            {
                lblAlbum.Content = $" {song.SongName}";
            }
            else
            {
                lblSongInfo.Content = $" {song.Artist.ArtistName} - {song.SongName}";
            }
        }
        private void btnPlay_Click(object sender, RoutedEventArgs e)
        {
            if (Load(new MemoryStream(songData.SongBytes)))
            {
                mediaPlayer.Play();
                gifImage.StartAnimate();
            }
        }

        private void btnPause_Click(object sender, RoutedEventArgs e)
        {
            mediaPlayer.Pause();
            gifImage.StopAnimate();
        }

        private void btnStop_Click(object sender, RoutedEventArgs e)
        {
            mediaPlayer.Stop();
            gifImage.StopAnimate();
        }

        private void sliProgress_DragStarted(object sender, DragStartedEventArgs e)
        {
            userIsDraggingSlider = true;
        }

        private void sliProgress_DragCompleted(object sender, DragCompletedEventArgs e)
        {
            userIsDraggingSlider = false;
            mediaPlayer.Position = TimeSpan.FromSeconds(sliProgress.Value);
        }

        private void sliProgress_ValueChanged(object sender, RoutedPropertyChangedEventArgs<double> e)
        {
            lblProgressStatus.Text = TimeSpan.FromSeconds(sliProgress.Value).ToString(@"hh\:mm\:ss");
            //lblProgressStatus.Text = audAct.player.CurrentPosition.ToString(@"hh\:mm\:ss");
        }

        private void MediaPlayerWindow_Closing(object sender, CancelEventArgs e)
        {
            // If data is dirty, notify user and ask for a response
            mediaPlayer.Stop();
            gifImage.StopAnimate();

        }
    }
}
