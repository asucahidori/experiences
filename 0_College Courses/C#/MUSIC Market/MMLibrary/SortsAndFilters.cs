using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MMLibrary
{
    public class SortsAndFilters
    {
        public List<Song> RetrieveOwnedSongs(int customerId)
        {
            List<Song> ownedSongs = new List<Song>();
            ownedSongs = (from cust in DBConnection.ctx.Customers
                          from song in DBConnection.ctx.Songs
                          where cust.Id == customerId
                          where song.Customers.Contains(cust)
                          select song).ToList();
            return ownedSongs;
        }

        public List<Song> RetrieveNotOwnedSongs(int customerId)
        {
            List<Song> ownedSongs = new List<Song>();
            ownedSongs = (from cust in DBConnection.ctx.Customers
                          from song in DBConnection.ctx.Songs
                          where cust.Id == customerId
                          where !song.Customers.Contains(cust)
                          select song).ToList();
            return ownedSongs;
        }

        public List<ListeningRecord> RetrieveUseageInfo(int customerId)
        {
            List<ListeningRecord> useageList = new List<ListeningRecord>();
            useageList = (from record in DBConnection.ctx.ListeningRecords
                          where record.CustomerId == customerId
                          select record).ToList();
            return useageList;
        }

        public List<Transaction> RetrieveTransactions(int customerId)
        {
            List<Transaction> useageList = new List<Transaction>();
            useageList = (from record in DBConnection.ctx.Transactions where record.CustomerId == customerId select record).ToList();
            return useageList;
        }
    }
}
