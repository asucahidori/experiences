   M S B A M L   `   `   `  ����  MMAdminVersion    MMAdminVersion.MainWindow   5   	   R NWindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35\ XPresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35W SPresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35D 9http://schemas.microsoft.com/winfx/2006/xaml/presentation    5   	   R NSystem.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     5   	   @d2http://schemas.microsoft.com/expression/blend/2008     5   	   Jmc;http://schemas.openxmlformats.org/markup-compatibility/2006     5   	     � WindowStartupLocation$  CenterScreen=�5      $��20(�6?    � Title$ 	AdminMain��5   	   $	��800��6   $
��1000��6(   ��5      �� 5	   
    �� ImageSource$ adminresources/bg1.jpg��6   .��5      �  � RowDefinitions 5   
   �� 5      $��1* �6   �� 5      $��3* �6   .+�5   
   �� $��0��6   $��Welcome Admin��6!   $��50(�66   $��Center=�6D   $��Center=�6_   $
��Bold"�6|   
�������6�   � 5   
   $��1��6    � ColumnDefinitions 5      �� 5      $��1* �6#   �� 5      $��1* �6#    5      �� 5      $
��1.5* �6    �� 5      $
��1.5* �6    �� 5      $
��0.5* �6    .+�5      �� -   5        
������ $��0��5   /   $��0��6?   $��Center=�6f   $��Center=�6�   $	��225��6�   $	��225��6�   
������ .��5      ��  �� Orientation$ Vertical=�6!   .+�5      �� $ ��adminresources/singer2.png��6    $��Uniform=�6D   �� 5      
�������$��Manage Artists��63   $��25(�6I   $
��Bold"�6W   
���   � �� Padding$ 10q�6|   $��Center=�6�   $��Center=�6�   5       5!      �� 5#      -   5        
������ $��1��5#   /   $��0��6?   $��Center=�6i   $��Center=�6�   $	��225��6�   $	��225��6�   
������ .��5$      �� .+�5%      �� $��adminresources/album2.png��6   $��Uniform=�6;   �� 5&      
�������$��Manage Albums��6/   $��25(�6D   $
��Bold"�6R   
���   �$ 10q�6w   $��Center=�6�   $��Center=�6�   5'      5(      �� 5*      -   5        $��btAddEditSong��5*   h   
������ $��0��6/   $��1��6?   $��Center=�6}   $��Center=�6�   $	��225��6�   $	��225��6�   
������ .��5+      �� .+�5,      �� $��adminresources/music.png��6   $��Uniform=�6>   �� 5-      
�������$��Manage Songs��63   $��25(�6G   $
��Bold"�6U   
���   �$ 10q�6z   $��Center=�6�   5.      5/      �� 51      -   5        
������ $��1��51   /   $��1��6?   $��Center=�6h   $��Center=�6�   $	��225��6�   $	��225��6�   
������ .��52      �� .+�53      �� $��adminresources/users.png��6   $��Uniform=�6>   �� 54      
�������$��Manage Users��6/   $��25(�6C   $
��Bold"�6Q   
���   �$ 10q�6v   $��Center=�6�   55      56      57      58      5<      