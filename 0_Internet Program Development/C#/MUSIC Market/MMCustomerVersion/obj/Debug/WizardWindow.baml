   M S B A M L   `   `   `  ����L  HMMCustomerVersion, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null5clr-namespace:MMCustomerVersionMMCustomerVersion  5   	   $    MMCustomerVersion.WizardWindow   5   	   R NWindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35\ XPresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35W SPresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35D 9http://schemas.microsoft.com/winfx/2006/xaml/presentation    5   	   R NSystem.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     5   	   @d2http://schemas.microsoft.com/expression/blend/2008     5   	   Jmc;http://schemas.openxmlformats.org/markup-compatibility/2006     5   	   1localclr-namespace:MMCustomerVersion     5   	   X TXceed.Wpf.Toolkit, Version=4.0.0.0, Culture=neutral, PublicKeyToken=3e4669d2f30244f44xctk)http://schemas.xceed.com/wpf/xaml/toolkit  5   	     � WindowStartupLocation$  CenterOwner=�5       � Title$ WizardWindow��5	   	   $	��450��6   $	��800��6+   .��5
        Xceed.Wpf.Toolkit.Wizard     FinishButtonClosesWindow .    CurrentPage 62   ��  �� ElementName$ Page2��.@�5   
   "  Xceed.Wpf.Toolkit.WizardPage  -   5          Name$ 	IntroPage��5         Title$ 
Intro Page��5         Description$ Welcome to Payment��5         CanSelectNextPage$ FalseX�5      .��5      � .+�5      �� -   5        $��lblUsername_wiz��5      $��Confirmation (USER NAME)��6/   $
��Left=�6R   $��	29,78,0,0q�6m   $	��Top=�6�   $	��159��6�   �� 5      $<��6Please Confirm password before continuing to purchase:��6   $
��Left=�6Y   $��
29,119,0,0q�6t   $	��Top=�6�   $	��318��6�   �� 5      -   5        $��cbPassword_wiz��5      $
��Show��61   $
��Left=�6@   $��173,158,0,0q�6[   $	��Top=�6p   6�   �� 5      -   5        $��btConfirmPassword_wiz��5      $��Confirm��66   $
��Left=�6H   $��
29,176,0,0q�6c   $	��Top=�6w   $��84��6�   $��33��6�   6�   G� 5      -   5        $��pbPassword_wiz��5   ?   	 G� PasswordChar$	 *��6   
 G� 	MaxLength$
 15��60   $
��Left=�6U   $��
29,148,0,0q�6p   $	��Top=�6�   $	��125��6�   �� 5      -   5        $��tbPasswordHidden_wiz��5      $y�Hidden=�66   $
��Left=�6J   $��25��6e   $��
29,148,0,0q�6q    �� TextWrapping$
 Wrap=�6�   $	��Top=�6�   $	��100��6�   5      5        5   
   -   5        $ Page0��5      $ Select your songs��5      $2 ,Choose the songs you would like to download:��5      $ FalseX�5         NextPage 5      �� $ Page1��   PreviousPage 5      �� $ 	IntroPage��.��5       � .+�5!      �� -   5        $��lvSongList_wiz��5!      $
��Left=�61   $	��192��6L   $��	10,10,0,0q�6Y   $	��Top=�6l   $	��500��6�    �� View 5"      �� 5#      .P�5$      �� $��	Song Name��6-    �� DisplayMemberBinding 6@   �� *
SongName+�� 5%      $��Artist Name��6-    6B   �� *Artist.ArtistName+�� 5&      $��
Song Price��6-    6A   �� *	SongPrice+�� 5'      $��Genre��6-    6<   �� *Genre+5(      5*      �� 5+      -	   5        $��btConfirm_wiz��5+      $��Confirm��6J   $
��Left=�6\   $��464,235,0,0q�6w   $	��Top=�6�   $	��125��6�   $��33��6�   5,      5-        5.   
   -
   5        $ Page1��5.         PageType$ Interior=�6)   $) #Payment - Summary of Selected Songs��5/      $< 6Here is the list of songs you are willing to purchase:��50      $ FalseX�53       51      �� $ Page2�� 52      �� $ Page0��.��54      � .+�55      �� -   5        $��lvSelectedSongs_wiz��55      $
��Left=�66   $	��500��6Q    56      �� 57      .P�58      �� $��	Song Name��6-    6@   �� *
SongName+�� 59      $��Artist Name��6-    6B   �� *Artist.ArtistName+�� 5:      $��
Song Price��6-    6A   �� *	SongPrice+�� 5;      $��Genre��6-    6<   �� *Genre+5<      5>      �� 5@      -   5         ��Name$ btConfirmFinal_wiz��5@      $��Confirm��6V   $
��Left=�6h   $��629,244,0,0q�6�   $	��Top=�6�   $	��125��6�   $��34��6�   �� 5A      $��Total Cost:��6   $
��Left=�6.   $��
543,82,0,0q�6I   $	��Top=�6]   �� 5B      -   5        $��lblTotalCost_wiz��5B      $�� ��60   $
��Left=�6;   $��
617,82,0,0q�6V   $	��Top=�6j   $��98��6�   5C      5D        5E   
   -   5        $ Page2��5E      $ Interior=�6)   $' !Payment - Credit Card Information��5F      $* $Please enter your method of payment:��5G      $ FalseX�5J       5H      �� $ LastPage�� 5I      �� $ Page1��.��5K      � .+�5L      �� $��Type of Card:��6   $
��Left=�60   $��	10,10,0,0q�6K   $	��Top=�6^   $��90��6v   �� 5M      $��Name on Card:��6   $
��Left=�60   $��	10,41,0,0q�6K   $	��Top=�6^   �� 5N      $��Card Number:��6   $
��Left=�6/   $��	10,72,0,0q�6J   $	��Top=�6]   $��90��6u   �� 5O      $��Month:��6   $
��Left=�6)   $��
10,103,0,0q�6D   $	��Top=�6X   $��90��6p   �� 5P      $��Year:��6   $
��Left=�6(   $��
10,134,0,0q�6C   $	��Top=�6W   $��90��6o   �� 5Q      $
��CVV:��6   $
��Left=�6'   $��
10,165,0,0q�6B   $	��Top=�6V   $��90��6n   �� 5R      $��Postal Code:��6   $
��Left=�6/   $��
10,200,0,0q�6J   $	��Top=�6^   $��87��6v   �� 5S      -   5        $��comboTypeCard��5S      $
��Left=�60   $��
105,13,0,0q�6K   $	��Top=�6_   $	��183��6w   .@�5T      �� .��6#   VISA6)   �� 5U      .��6#   
MASTERCARD6/   �� 5V      .��6#   AMEX6)   �� 5W      .��6#   	DISCOVERY6.   5X      �� 5Y      -   5        $��
tbCardName��5Y      $
��Left=�6,   $��23��6G   $��
105,45,0,0q�6S   $
 Wrap=�6g   $	��Top=�6{   $	��183��6�   �� 5Z      -   5        $��tbCardNumber��5Z      $
��Left=�6.   $��23��6I   $��
105,75,0,0q�6U   $
 Wrap=�6i   $	��Top=�6}   $	��183��6�   �� 5[      -   5        $��tbCardMonth��5[      $
��Left=�6-   $��23��6H   $��105,106,0,0q�6T   $
 Wrap=�6i   $	��Top=�6}   $��87��6�   �� 5\      -   5        $��
tbCardYear��5\      $
��Left=�6,   $��23��6G   $��105,137,0,0q�6S   $
 Wrap=�6h   $	��Top=�6|   $��87��6�   �� 5]      -   5        $��	tbCardCVV��5]      $
��Left=�6+   $��23��6F   $��105,165,0,0q�6R   $
 Wrap=�6g   $	��Top=�6{   $��49��6�   �� 5^      -   5        $��tbCardpostalCode��5^      $
��Left=�62   $��23��6M   $��105,200,0,0q�6Y   $
 Wrap=�6n   $	��Top=�6�   $	��183��6�   �� 5_      -   5        $��
btAddNewCC��5_      {�. $��
Add New CC��6U   $
��Left=�6j   $��
10,243,0,0q�6�   $	��Top=�6�   $	��129��6�   $��35��6�   �� 5`      -   5        $��Verify Payment��5`   7   $
��Left=�6P   $��158,243,0,0q�6k   $	��Top=�6�   $	��130��6�   $��35��6�   �� 5a      $-��'Current Credit Card (VISA) Confirm CVC:��6   $
��Left=�6J   $��
387,25,0,0q�6e   $	��Top=�6y   $	��230��6�   �� 5b      -   5        $��btUseSavedCC_wiz��5b      $��Use saved Payment��61   $
��Left=�6M   $��387,124,0,0q�6h   $	��Top=�6}   $	��185��6�   $��34��6�   �� 5c      -   5        $��lblTotalCostPayment_wiz��5c      $��Total Cost:��67   $
��Left=�6M   $��387,168,0,0q�6h   $	��Top=�6}   $	��185��6�   $��32��6�   G� 5d      -   5        $��pbCVCConfirm_wiz��5d      $	 *��66   $
 3��6G   $
��Left=�6U   $��
622,25,0,0q�6p   $	��Top=�6�   $	��100��6�   �� 5e      -   5        $��comboCCfromUsers_wiz��5e      $
��Left=�67   $��
387,65,0,0q�6R   $	��Top=�6f   $	��230��6~   5g      5h        5i   
   -   5        $ LastPage��5i      $ Interior=�6,   $  Payment - Final Validation��5j      $ Thank you for Purchasing��5k         	CanFinish$
 TrueX�5l      $ FalseX�5m      .��5n      � .+�5o      �� $��Email Reciept:��6   $
��Left=�61   $��
127,40,0,0q�6L   $	��Top=�6`   �� 5p      -   5        $��tbEmail_wiz��5p      $
��Left=�6-   $��23��6H   $��
134,77,0,0q�6T   $
 Wrap=�6h   $ ��(pre-populated user email)��6|   $	��Top=�6�   $	��225��6�   �� 5q      -   5        $��btEmailReceipt_wiz��5q      $��Send Email Receipt��6T   $
��Left=�6q   $��134,114,0,0q�6�   $	��Top=�6�   $	��167��6�   5s      5t      5u      5v      