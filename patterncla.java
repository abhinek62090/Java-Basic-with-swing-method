class test
{
	public static void main(String []a)
	{
		int i,j,k;
		for(i=0;i<a.length;i++)
		{
			for(k=a[i].length()-1;k>=0;k--)
			{
				for(j=0;j<=k;j++)
				{
					System.out.print(a[i].charAt(j));
				}
				System.out.println();
			}
		}
	}
}