   M S B A M L   `   `   `  ����L  HMMCustomerVersion, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null5clr-namespace:MMCustomerVersionMMCustomerVersion  5   	   #    MMCustomerVersion.LoginWindow   5   	   R NWindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35\ XPresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35W SPresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35D 9http://schemas.microsoft.com/winfx/2006/xaml/presentation    5   	   R NSystem.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     5   	   @d2http://schemas.microsoft.com/expression/blend/2008     5   	   Jmc;http://schemas.openxmlformats.org/markup-compatibility/2006     5   	   b ^MaterialDesignThemes.Wpf, Version=4.0.0.2422, Culture=neutral, PublicKeyToken=df2a72020bd7962aFmaterialDesign1http://materialdesigninxaml.net/winfx/xaml/themes  5   	   +localclr-namespace:MMCustomerVersion  5   	   X TXceed.Wpf.Toolkit, Version=4.0.0.0, Culture=neutral, PublicKeyToken=3e4669d2f30244f44xctk)http://schemas.xceed.com/wpf/xaml/toolkit  5   	     � WindowStartupLocation$  CenterScreen=�5   7    � Title$ LoginWindow��5
   	   $	��680��6   $	��900��6*   .��5      � .+�5   
   � $	��400��6   $	��350��6   
�������.+�5      �� $	��215��6   $	��Top=�6%   $��	0,-15,0,0q�6=   ��5      �� 5       �� EndPoint$ 0.5,1&�6*    �� 
StartPoint$ 0.5,0&�6;   .��5      �  � Color$ 	#FF2281D1��6'   � 5      $ 	#FF34268A��6'    � Offset$ 1Q�69   � 5      $ 	#FF33288B��6'   $	 0.5Q�69   5      5      �� 5      $	��240��6   $	��280��6%   
�������$��Bottom=�6?   $��35,0,35,100q�6Z    �� RadiusX$ 12��6o    �� RadiusY$ 15��6|   $��1��6�   
������� J� Effect 5      3  -System.Windows.Media.Effects.DropShadowEffect  5      	   Color$	 	#FFBBBBBB��6'   
   	Direction$
 0Q�69      
BlurRadius$ 15Q�6G      RenderingBias$ Quality=�6W      ShadowDepth$ 3Q�6o   5      � 5      $	��280��6   $	��240��6   $��Bottom=�6,   $��0,100q�6G   .+�5      �� -   5         ��Name$ tbLoginText��5      $��LOGIN��61   $��Center=�6>   $	��Top=�6[   $��5q�6s   
�������$��18(�6�   �� 5      $��Center=�6   $��10,20,10,25q�68   $	��195��6M   .+�5      �� -   5         ��Name$ tbName��5      )  #MaterialDesignThemes.Wpf.HintAssist   Hint$ USERID��6.    %  !MaterialDesignFloatingHintTextBox#��[  6V   $
��0,10q�6�   G� 5       -   5         G�Name$ 
tbPassword��5    "   $ PASSWORD��66    ) %MaterialDesignFloatingHintPasswordBox#��[ 6`   $
��0,10q�6�   �� 5!      -   5        $ 
tbCustName��5!      $
 NAME��62   #��[  6X   $
��0,10q�6�   5"      5#      �� 5$      -   5         ��Name$ btLogin��5$      $��Bottom=�6&   $
��0,85q�6A   $	��150��6O   $��LOGIN��6[   6k   �� 5%      $��Welcome to music market��6   $	��Top=�67   $��Center=�6O   $��
81,20,52,0q�6l   
�������$��20(�6�   $	��217��6�   $��Arial Narrow)�6�   �� 5&      -   5         ��Name$ 	lblSignUp��5&      $ ��NEW USER        >> SIGN UP��6'   $
��Left=�6L   $��108,335,0,0q�6g   $	��Top=�6|   $	��145��6�   $��Impact)�6�   6�   5'      5(      5)      