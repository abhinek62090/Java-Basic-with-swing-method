import javax.swing.*;
class login
{
	public static void main(String []a)
	{
		String str1,str2;
		str1=JOptionPane.showInputDialog("Enter User ID");
		str2=JOptionPane.showInputDialog("Enter Password");
		if(str1.equalsIgnoreCase("get"))
		{
			if(str2.equals("project"))
			{
				JOptionPane.showMessageDialog(null,"WELCOME TO OUR WEBSITE");
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Incorrect Password");
			}
		}
		else
		{
			JOptionPane.showMessageDialog(null,"ID not found");
		}
	}
}