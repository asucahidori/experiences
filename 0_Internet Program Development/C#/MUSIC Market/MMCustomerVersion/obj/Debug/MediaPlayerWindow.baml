   M S B A M L   `   `   `  ����L  HMMCustomerVersion, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null5clr-namespace:MMCustomerVersionMMCustomerVersion  5   	   )    #MMCustomerVersion.MediaPlayerWindow   5   	   R NWindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35\ XPresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35W SPresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35D 9http://schemas.microsoft.com/winfx/2006/xaml/presentation    5   	   R NSystem.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     5   	   @d2http://schemas.microsoft.com/expression/blend/2008     5   	   Jmc;http://schemas.openxmlformats.org/markup-compatibility/2006     5   	   1localclr-namespace:MMCustomerVersion     5   	   -   5          � WindowStartupLocation$  CenterScreen=�5   7    � Title$ MediaPlayerWindow��5	   	   $��416.3��6#   $��533.2��62   .��5
      � .+�5   
   �� $��10,10,6.4,9.2q�6   ���#ae3434.+�5      � $��Center=�6   $��	0,0,0.0,0q�66   $	��510��6I   ���#ae3434$��25��6j   .+�5      �� -   5         ��Name$ lblAlbum��5      $��25��6*   $��	0,0,0.4,0q�66   $	��175��6I   
�������$��14(�6h   �� 5      -   5        $ lblSongInfo��5      $��25��6-   $��	0,0,0.4,0q�69   $	��330��6L   
�������$��14(�6k   5      �� 5      -   5        $ 	lblStatus��5      ���#ae3434$��18(�6<   
�������$��Center=�6b   $	��Top=�6�   $��0,0,0,5q�6�   $	��263��6�   � 5      $��Center=�6   $��160,0,130.4,0q�66   $	��220��6M   .+�5      �� -   5         ��Name$ btnPlay��5       J� RenderTransformOrigin$ 0.267,7.544&�6@   $
��Play��6d   $��26��6s   $��51��6   $��10(�6�   �� 5      -   5        $ btnPause��5      $	��5,0q�6+   $��Pause��6O   $��26��6_   $��60��6k   $��10(�6v   �� 5      -   5        $ btnStop��5      $
��Stop��6@   $ -0.513,0.494&�6O   $��26��6t   $��55��6�   $��10(�6�   5      �� 5      5      �� 5      $��	0,0,0.4,0q�6   ���#ae3434
���������5      �� 5      .R�5      �  � ColumnDefinitions 5       �� 5!   "   $
��Auto �63   �� 5"   "   $��* �63   �� 5#   "   $
��Auto �63   5%      5&      .@�5(      �� $��Right=�6    $��
0,0,-0.4,0q�6<   $��50��6P   .��5)      �� -   5         ��Name$ lblProgressStatus��5)       �� 6<   $�00:00:00��6@   6S   5*      �� 5+      $��1��6    $��Stretch=�60   .��5,      �� -	   5         ��Name$ sliProgress��5,      
�������$��
0,0,11.6,0q�6�   5-      �� 5.      $��2��6    .��5/      � -
   5         �Name$ pbVolume��5/   "   $��70��64   $��12��6?   	 � Maximum$	 1Q�6K   
 � Value
 6W   �� *Volume+ �� ElementName$ mePlayer��50      51      52      53      54      