   M S B A M L   `   `   `  ����I  EMMAdminVersion, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null/clr-namespace:MMAdminVersionMMAdminVersion  5   	   "    MMAdminVersion.AddEditArtist   5   	   R NWindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35\ XPresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35W SPresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35D 9http://schemas.microsoft.com/winfx/2006/xaml/presentation    5   	   R NSystem.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     5   	   @d2http://schemas.microsoft.com/expression/blend/2008     5   	   Jmc;http://schemas.openxmlformats.org/markup-compatibility/2006     5   	   .localclr-namespace:MMAdminVersion     5   	     � WindowStartupLocation$  CenterOwner=�5      $��14(�6>    � Title$ AddEditArtist��5   	   $	��450��6   $	��800��6,   ��5	      �� 5
   
    �� ImageSource$ adminresources/bg2.jpg��6   .��5      � .+�5   
   �� -   5        $��lvArtist��5   s   $
��Left=�6   $	��348��6/   $��	64,33,0,0q�6<   $	��Top=�6O   $	��270��6g   $
��Bold"�6�    �� View 5      �� 5      .P�5      ��  �� Width$	 200��6%   $��Artist Name��61    �� DisplayMemberBinding 6F   �� *
ArtistName+5      5      �� 5   
   $
��Bold"�6   
���   �
�������$	��ID:��6H   $
��Left=�6V   $��
475,90,0,0q�6q   $	��Top=�6�   �� 5   
   -   5        $��lblArtistId��5   H   $
��Bold"�6   
���   �
�������$��-��6[   $
��Left=�6g   $��
517,90,0,0q�6�   $	��Top=�6�   $��68��6�   �� 5   
   
���   �
�������$
��Bold"�66   $��Artist Name:��6H   $
��Left=�6_   $��411,134,0,0q�6z   $	��Top=�6�   �� 5   
   -   5        $��tbArtistName��5   J   $
��Bold"�6   
���   �
�������$
��Left=�6^   $��28��6y   $��517,134,0,0q�6�    �� TextWrapping$
 Wrap=�6�   $�� ��6�   $	��Top=�6�   $	��194��6�   �� 5   
   -   5        $��btAddUpdateArtist��5   l   $
��Bold"�6   
����� �
�������$
��Left=�6�   $	��Add��6�   $��411,187,0,0q�6�   $	��Top=�6�   $	��135��6�   �� 5   
   -   5        $��btDeleteArtist��5   @   {�.  $
��Bold"�6V   
����� �
�������$��Delete��6�   $
��Left=�6�   $��576,187,0,0q�6�   $	��Top=�6�   $	��135��6�   �� 5   
   $
��Bold"�6   
����� �
������� �� IsCancel . $
��Back��6]   $
��Left=�6l   $��493,228,0,0q�6�   $	��Top=�6�   $	��136��6�   5      5      