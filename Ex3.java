class Ex3 
{
	public static void main(String[] args) 
	{
		int n= 4;

		for (int i=1;i<=n ;i++ )
		{
			for (int j=1;j<=n*2 ;j++ )
			{
				if (i+j>=n+1&&j-1<n)
				{
					System.out.print("* ");
				}else
					System.out.print(" ");
			}
					System.out.println("Hello World!");
		}
	}
}
