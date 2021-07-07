using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MMLibrary
{
    public class ManipulateDB
    {
        public void AddArtist(string artistName)
        {
            DBConnection.ctx.Artists.Add(new Artist { ArtistName = artistName });
            //DBConnection.ctx.SaveChanges();
        }
        public void AddArtist(Artist artist)
        {
            DBConnection.ctx.Artists.Add(artist);
           // DBConnection.ctx.SaveChanges();
        }

        public void AddAlbum(decimal albumPrice, string albumName, DateTime releaseDate, Artist artist)
        {
            DBConnection.ctx.Albums.Add(new Album { AlbumPrice = albumPrice, AlbumName = albumName, ReleaseDate = releaseDate, ArtistId = artist.Id });
            //DBConnection.ctx.SaveChanges();
        }
        public void AddAlbum(Album album)
        {
            DBConnection.ctx.Albums.Add(album);
            //DBConnection.ctx.SaveChanges();
        }

        public void AddSong(String fileName, decimal songPrice, string songName, string genre, Artist artist, Album album = null)
        {
            //Convery mp3 to byte
            byte[] songToUpload = File.ReadAllBytes(fileName);
            //Fill Songs table
            if(album != null)
            {
                DBConnection.ctx.Songs.Add(new Song { SongPrice = songPrice, SongName = songName, Genre = genre, ArtistId = artist.Id, AlbumId = album.Id });
            }
            else
            {
                DBConnection.ctx.Songs.Add(new Song { SongPrice = songPrice, SongName = songName, Genre = genre, ArtistId = artist.Id});
            }
            

            List<Song> songList = (from song in DBConnection.ctx.Songs select song).ToList();

            int songId = songList.Max(s => s.Id) + 1;
            //Fill songData table
            DBConnection.ctx.SongDatas.Add(new SongData { SongBytes = songToUpload, SongId = songId});
            //DBConnection.ctx.SaveChanges();
        }
        public void AddSong(Song song)
        {
            DBConnection.ctx.Songs.Add(song);
            //DBConnection.ctx.SaveChanges();
        }
        public void AddSongData(SongData songData)
        {
            DBConnection.ctx.SongDatas.Add(songData);
            //DBConnection.ctx.SaveChanges();
        }

        public int LatestArtistID()
        {
            int latestArtistId = (from ar in DBConnection.ctx.Artists select ar).ToList().Max(ar => ar.Id);
            return latestArtistId;
        }
        public int LatestAlbumID()
        {
            int latestAlbumId = (from al in DBConnection.ctx.Albums select al).ToList().Max(al => al.Id);
            return latestAlbumId;
        }
        public int LatestSongID()
        {
            int latestSongId = (from so in DBConnection.ctx.Songs select so).ToList().Max(so => so.Id);
            return latestSongId;
        }

        public List<Song> RetrieveAllSongs()
        {
            List<Song> songList = (from song in DBConnection.ctx.Songs select song).ToList();
            return songList;
        }
        public List<Artist> RetrieveAllArtists()
        {
            List<Artist> artistList = (from artist in DBConnection.ctx.Artists select artist).ToList();
            return artistList;
        }

        public List<Album> RetrieveAllAlbums()
        {
            List<Album> albumList = (from album in DBConnection.ctx.Albums select album).ToList();
            return albumList;
        }

        public void DeleteUser(int userId)
        {
            User currUser = (from user in DBConnection.ctx.Users where user.Id == userId select user).FirstOrDefault();
            if (currUser != null)
            {
                DBConnection.ctx.Users.Remove(currUser);
                DBConnection.ctx.SaveChanges();
            }
        }

    }
}
