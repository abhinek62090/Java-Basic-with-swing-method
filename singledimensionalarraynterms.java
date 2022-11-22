import java.util.*;
class test
{
	public static void main(String []a)
	{
		
		Scanner s=new Scanner(System.in);
		int i,j,sum=0;
		System.out.println("Enter a number till you want to enter=");
		j=s.nextInt();
		int []n=new int[j];
		for(i=0;i<j;i++)
		{
			System.out.println("Enter a number=");
			n[i]=s.nextInt();
		}
		for(i=0;i<j;i++)
		{
			if(n[i]%2==0)
			{
				sum=sum+n[i];
			};
		}
		System.out.println(sum);
	}
}