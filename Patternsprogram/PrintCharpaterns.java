import java.util.Scanner;
class PrintCharpaterns
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number: ");
		int n=sc.nextInt();
		char ch='A';
		for (int i=1;i<=n ;i++ )
		{
			for (int j=1;j<=n;j++)
			{
				  if(i<=j) {
					  System.out.print(ch++ +" ");
				  }
				  else {
					  System.out.print(" ");
				  }

			}
							  System.out.println();
		}

	}
}
