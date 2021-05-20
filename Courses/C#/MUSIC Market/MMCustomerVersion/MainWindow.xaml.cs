using MMLibrary;
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
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace MMCustomerVersion
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        //init
        private User user;

        public MainWindow()
        {
            InitializeComponent();
            windowBackgroundSet();
        }

        private void btPurchase_Click(object sender, RoutedEventArgs e)
        {
            //var purchase = new WizardWindow();
            //purchase.ShowDialog();
        }

        private void windowBackgroundSet()
        {
            ImageBrush imgBrush = new ImageBrush();
            imgBrush.ImageSource = new BitmapImage(new Uri(@"..\..\Images\UWbackgroud.jpg", UriKind.Relative));
            imgBrush.TileMode = TileMode.Tile;
            imgBrush.Stretch = Stretch.Fill;
            this.Background = imgBrush;
        }

        private void BtnWelcomeWindow_Click(object sender, RoutedEventArgs e)
        {
            //create the default user information(this is a demo data[id:1; name:Jerry])
            //user = DBConnection.ctx.Users.Where(u => u.CustomerId == 1).FirstOrDefault();
            if (user == null) 
            {
                MessageBox.Show("Please login first!");
                return;
            }
            UsersMainWindow userWindow = new UsersMainWindow(user);
            userWindow.ShowDialog();
        }

        private void btnLogin_Click(object sender, RoutedEventArgs e)
        {
            //1: User Acount; 2: Admin Acount
            LoginWindow loginWindow = new LoginWindow(1);
            loginWindow.ShowDialog();
            //if return true, then transfer the data to welcome window
            user = loginWindow.users;

        }
    }
}
