using Plugin.SimpleAudioPlayer;
using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MMLibrary
{
    public class AudioActions
    {
        public ISimpleAudioPlayer player = Plugin.SimpleAudioPlayer.CrossSimpleAudioPlayer.Current;
        public void PlaySelected(int songId)
        {
            SongData selectedSong = (from songs in DBConnection.ctx.SongDatas where songs.SongId == songId select songs).FirstOrDefault();
            player.Load(new MemoryStream(selectedSong.SongBytes));
            player.Play();
        }
        public void PlaySelected(byte[] currSong)
        {
            player.Load(new MemoryStream(currSong));
            player.Play();
        }
    }
}
