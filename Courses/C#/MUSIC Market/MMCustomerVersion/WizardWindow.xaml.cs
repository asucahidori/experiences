using MMLibrary;
using Stripe;
using Stripe.Checkout;
using System;
using System.Collections.Generic;
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
    /// Interaction logic for WizardWindow.xaml
    /// </summary>
    public partial class WizardWindow : Window
    {
        // songs in cart
        private List<Song> cardList;
        // songs to be charged
        public List<Song> paidList;
        // user information
        public User user;
        // for Sorting Purposes
        SortsAndFilters sortFilter = new SortsAndFilters();
        // DB connection
        DBConnection ctx = new DBConnection();
        // list of credit cards
        public List<PaymentInfo> payInfoList;

        public WizardWindow(List<Song> cardList = null, User user = null)
        {
            InitializeComponent();

            this.cardList = cardList;
            this.user = user;
            //lvSongList_wiz.ItemsSource = (from s in DBConnection.ctx.Songs select s).ToList<Song>();

            lblUsername_wiz.Content = "Confirmation User:" + user.UserName;
            // to load the songs from the cart
            lvSongList_wiz.ItemsSource = cardList;
            // to load credit cards from the user
            FillCombo();

        }
        List<PaymentInfo> methodsList;
        
        public void FillCombo()
        {
            //long x = DBConnection.ctx.PaymentInfos
            methodsList = DBConnection.ctx.PaymentInfos.Where(pay => pay.CustomerId == user.CustomerId).ToList();
            List<String> payCCList = new List<String>();

            foreach(PaymentInfo payCC in methodsList)
            {
                payCCList.Add(string.Format("Card name:{0}, CC ending in *{1}", payCC.CardholderName, (payCC.CardNumber.ToString()).Substring(payCC.CardNumber.ToString().Length - 4, 4)));
                
            }

            comboCCfromUsers_wiz.ItemsSource = payCCList;
        }

        // ----------------------------------------- intro page -----------------------------------------

        private void cbPassword_wiz_Checked(object sender, RoutedEventArgs e)
        {
            pbPassword_wiz.Visibility = Visibility.Collapsed;
            tbPasswordHidden_wiz.Visibility = Visibility.Visible;
            tbPasswordHidden_wiz.Text = pbPassword_wiz.Password;
        }

        private void cbPassword_wiz_Unchecked(object sender, RoutedEventArgs e)
        {
            pbPassword_wiz.Visibility = Visibility.Visible;
            tbPasswordHidden_wiz.Visibility = Visibility.Collapsed;
            tbPasswordHidden_wiz.Text = pbPassword_wiz.Password;
        }

        private void btConfirmPassword_wiz_Click(object sender, RoutedEventArgs e) 
        {
            if (user.UserPassword != pbPassword_wiz.Password) // to verify "password123"
            {
                IntroPage.CanSelectNextPage = false;
                MessageBox.Show(this, "Please input the correct password.", "Input error.", MessageBoxButton.OK, MessageBoxImage.Error);
                return;
            }
            else
            {
                IntroPage.CanSelectNextPage = true;
            }
        }

        // ----------------------------------------- page 0 -----------------------------------------

        private void btConfirm_wiz_Click(object sender, RoutedEventArgs e)
        {
            // where sorting of the paid vs unpaid songs

            List<Song> songsOwnedByUser = sortFilter.RetrieveOwnedSongs(user.CustomerId);

            paidList = cardList.Except(songsOwnedByUser).ToList();

            // ------------------

            // to confirm selection
            foreach (Song item in paidList)
            {
                lvSelectedSongs_wiz.Items.Add(item);
            }

            double price = 0.0;
            foreach (Song item in lvSelectedSongs_wiz.Items)
            {
                price += Convert.ToDouble(item.SongPrice);
            }

            lblTotalCost_wiz.Content = string.Format("{0:F2}", price) + " $";

            Page0.CanSelectNextPage = true;
        }

        // ----------------------------------------- page 1 -----------------------------------------

        private void btConfirmFinal_wiz_Click(object sender, RoutedEventArgs e)
        {
            // to confirm final selection

            lblTotalCostPayment_wiz.Content = "Total Cost: " + lblTotalCost_wiz.Content;

            Page1.CanSelectNextPage = true;
        }

        // ----------------------------------------- page 2 -----------------------------------------

        PaymentInfo selectedCard;
        private void btUseSavedCC_wiz_Click(object sender, RoutedEventArgs e)
        {
            
                /*
                 * VISA / 4242 4242 4242 4242 - MONTH / 08 - YEAR / 24 - CVC / 123 - ZIP / 94107 -- Sucessful payment
                 * 
                 * VISA / 4000 0000 0000 9995 - MONTH / 08 - YEAR / 24 - CVC / 123 - ZIP / 94107 -- Declined payment
                 */
                
                int selCC = comboCCfromUsers_wiz.SelectedIndex;
                selectedCard = methodsList[selCC];

                tbCardName.Text = selectedCard.CardholderName;
                tbCardNumber.Text = Convert.ToString(selectedCard.CardNumber);
                tbCardMonth.Text = Convert.ToString(selectedCard.ExpirationDate.Month);
                tbCardYear.Text = Convert.ToString(selectedCard.ExpirationDate.Year);
                tbCardCVV.Text = pbCVCConfirm_wiz.Password.ToString();
                tbCardpostalCode.Text = selectedCard.ZipCode;

                btAddNewCC.IsEnabled = false;
            
        }

        private void btAddNewCC_Click(object sender, RoutedEventArgs e)
        {
            // if credit card new method, to add to database for user 

            // new CardholderName
            string cardholdName = tbCardName.Text;
            // new CardNumber
            long cardholdNumber = Convert.ToInt64(tbCardNumber.Text);
            // New ExpiryDate
            string cardMonthStr = tbCardMonth.Text;
            string cardYearStr = tbCardYear.Text;
            var cardExpStr = string.Format("{0}/{1}", cardMonthStr, cardYearStr);
            DateTime cardExp = DateTime.Parse(cardExpStr); // should work with only month and year according to the 
            // current customer id
            int cardholdCustId = user.CustomerId;
            // new zipcode / postal code
            string cardZip = tbCardpostalCode.Text;

            PaymentInfo newPayInfo = new PaymentInfo { CardholderName = cardholdName, CardNumber = cardholdNumber, ExpirationDate = cardExp, CustomerId = cardholdCustId, ZipCode = cardZip };

            DBConnection.ctx.PaymentInfos.Add(newPayInfo);

            DBConnection.ctx.SaveChanges();

            selectedCard = newPayInfo;

            // refresh combo box
            FillCombo();
            // show dialog to display adding new
        }

        private void btVerifyPayment_Click(object sender, RoutedEventArgs e)
        {
            
            // Stripe - testing
            /*
            StripeConfiguration.ApiKey = "sk_test_51IfyxWLJ2H9OCwS7RWvH2YyJWShgoV0xEryHGoT1pZ8dxwy2Mk5y6jSI9RxEE2KJoHS24VZFC4MQRMqjlQfZsaZ400nXegMSRo";

            // create the payment method
            var options1 = new PaymentMethodCreateOptions
            {
                Type = "card",
                Card = new PaymentMethodCardOptions
                {
                    Number = tbCardNumber.Text,
                    ExpMonth = (long?)Convert.ToInt32(tbCardMonth.Text),
                    ExpYear = (long?)Convert.ToInt32(tbCardYear.Text),
                    Cvc = tbCardCVV.Text,
                },
            };
            var service1 = new PaymentMethodService();
            service1.Create(options1);

            // create session for checkout
            var options2 = new SessionCreateOptions
            {
                SuccessUrl = "https://example.com/success",
                CancelUrl = "https://example.com/cancel",
                PaymentMethodTypes = new List<string>
                  {
                    "card",
                  },
                    LineItems = new List<SessionLineItemOptions>
                  {
                    new SessionLineItemOptions
                    {
                      Price = "price_H5ggYwtDq4fbrJ",
                      Quantity = 2,
                    },
                  },
                Mode = "payment",
            };
            var service2 = new SessionService();
            service2.Create(options2);
            */
            /*
            var options2 = new ChargeCreateOptions
            {
                Amount = (long?)lblTotalCostPayment_wiz.Content,
                Currency = "CAD",
                Description = string.Format("Charge for {0}", user.UserName),
                Source = tbCardNumber.Text // 
            };
            var service2 = new ChargeService();
            service.Create(options);
            */
            // 

            Page2.CanSelectNextPage = true;
        }

        // ----------------------------------------- last page -----------------------------------------
        
        private void btEmailReceipt_wiz_Click(object sender, RoutedEventArgs e)
        {
            // New transaction
            DateTime transDate = DateTime.Today;
            int transCustId = user.CustomerId;
            int transPayInfo = selectedCard.Id;

            Transaction newTransaction = new Transaction{ TransactionDate = transDate, CustomerId = transCustId, PaymentInfoId = transPayInfo };
            
            DBConnection.ctx.Transactions.Add(newTransaction);

            DBConnection.ctx.SaveChanges();

            // New Transaction Songs

            

            // Adding paid songs to curr Customer.Songs
            
            foreach(Song song in paidList)
            {
                newTransaction.Songs.Add(song);
                user.Customer.Songs.Add(song);

            }
            DBConnection.ctx.SaveChanges();
        }
    }
}

