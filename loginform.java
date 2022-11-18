import javax.swing.*;
class login
{
	public static void main(String []a)
	{
		int i,f=0;
		String str1,str2;
		for(i=1;i<=3;)
		{
			str1=JOptionPane.showInputDialog("Enter User ID");
			str2=JOptionPane.showInputDialog("Enter Password");
			if(str1.equalsIgnoreCase("get"))
			{
				if(str2.equals("project"))
				{
					f=1;
					break;
				}
			}
			else
			{
				JOptionPane.showMessageDialog(null,"ID not found");
				JOptionPane.showMessageDialog(null,"Left="+(3-i));
				i++;
			}
			if(f==1)
				JOptionPane.showMessageDialog(null,"WELCOME");
			if(i==4)
				JOptionPane.showMessageDialog(null,"Time Over");
		}
	}
}