using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MMLibrary
{
    public class UtilsAndResources
    {
        public List<string> genreList = new List<string>();
        public List<string> GetGenres()
        {
            genreList.Add("Other");
            genreList.Add("Pop");
            genreList.Add("Techno");
            genreList.Add("Rock");
            genreList.Add("R&B");
            genreList.Add("Rap");
            genreList.Add("Folk");
            genreList.Add("Funk");
            genreList.Add("Blues");
            genreList.Add("Alternative");
            genreList.Add("Country");
            return genreList;
        }
    }
}
