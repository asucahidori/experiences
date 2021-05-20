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
using System.Windows.Shapes;

namespace MMCustomerVersion
{
    /// <summary>
    /// Interaction logic for LoginWindow.xaml
    /// </summary>
    public partial class LoginWindow : Window
    {
        //init
        public User users;
        private Boolean NewUser = false;
        private int UserStatus; // 1: User 2:Customer

        //session Username ,password,customerName
        private string _UserName;
        public string UserName
        {
            get { return _UserName; }
        }
        private string _Password;
        public string Password
        {
            get { return _Password; }
        }
        private string _CustomerName;
        public string CustomerName
        {
            get { return _CustomerName; }
        }

        public LoginWindow(int UserStatus)
        {
            InitializeComponent();
            windowBackgroundSet();
            this.UserStatus = UserStatus;
        }

        private void windowBackgroundSet() 
        {
            ImageBrush imgBrush = new ImageBrush();
            imgBrush.ImageSource = new BitmapImage(new Uri(@"..\..\Images\Login_Backgrond.jpg", UriKind.Relative));
            imgBrush.TileMode = TileMode.Tile;
            imgBrush.Stretch = Stretch.Fill;
            this.Background = imgBrush;
            btnStatusChange();
        }

        private void btLogin_Click(object sender, RoutedEventArgs e)
        {
            //Judge the user status
            //New User
            _UserName = tbName.Text;
            _Password = tbPassword.Password;
            if (NewUser)
            {
                _CustomerName = tbCustName.Text;
                // step 1. judge the input value
                if (_UserName.Length < 2 || _Password.Length < 6 || _CustomerName.Length < 2)
                {
                    MessageBox.Show("UserID or Password or Name invalid!");
                    return;
                }
                // step 2. judge the user name exist or not
                users = DBConnection.ctx.Users.Where(u => u.UserName == _UserName & u.UserPassword == _Password).FirstOrDefault();
                if (users != null)
                {
                    MessageBox.Show("User Name has been used, try again!");
                    return;
                }
                // step 3. add the user info into DB
                Customer customer = new Customer { CustomerName = _CustomerName };
                DBConnection.ctx.Customers.Add(customer);
                DBConnection.ctx.Entry(customer);
                //new user
                if (UserStatus == 1)
                {
                    DBConnection.ctx.Users.Add(new User { UserName = _UserName, UserPassword = _Password, CustomerId = customer.Id, Valid = true, IsAdmin = false });
                    MessageBox.Show("user add", _UserName);
                    DBConnection.ctx.SaveChanges();
                }
                //admin user
                else if (UserStatus == 2)
                {
                    DBConnection.ctx.Users.Add(new User { UserName = _UserName, UserPassword = _Password, CustomerId = customer.Id, Valid = true, IsAdmin = true });
                    DBConnection.ctx.SaveChanges();
                }
                else 
                {
                    MessageBox.Show("login invalid!");
                    return;
                }

                DialogResult = true;
            }
            //Old User
            else
            {
                if (_UserName.Length < 2 || _Password.Length < 6)
                {
                    MessageBox.Show("UserID or Password invalid!");
                    return;
                }

                users = DBConnection.ctx.Users.Where(u => u.UserName == _UserName & u.UserPassword == _Password).FirstOrDefault();
                if (users == null)
                {
                    MessageBox.Show("User Name or Password is wrong, try again!");
                    return;
                }
                if(!users.Valid)
                {
                    MessageBox.Show("User account was locked!");
                    return;
                }
                //new user
                if (UserStatus == 1d)
                {
                    if (users.IsAdmin)
                    {
                        MessageBox.Show("This is Admin account, invalid!");
                        return;
                    }
                }
                //admin user
                else if (UserStatus == 2)
                {
                    if (!users.IsAdmin)
                    {
                        MessageBox.Show("This is User account, invalid!");
                        return;
                    }
                }
                else
                {
                    MessageBox.Show("login invalid!");
                    return;
                }
                DialogResult = true;
            }
        }

        private void SignUpDoubleClick(object sender, MouseButtonEventArgs e)
        {
            if (!NewUser)
            {
                tbCustName.Visibility = Visibility.Visible;
                btLogin.Content = "SIGN UP";
                lblSignUp.Content = "HAVE ACCOUNT    >> LOGIN";
                NewUser = true;
            }
            else 
            {
                btnStatusChange();
                lblSignUp.Content = "NEW USER        >> SIGN UP";
                NewUser = false;
            }
        }

        private void btnStatusChange()
        {
            tbCustName.Visibility = Visibility.Hidden;
            btLogin.Content = "LOGIN";
        }

    }
}