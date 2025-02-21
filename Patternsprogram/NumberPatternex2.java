import java.util.Scanner;
class NumberPatternEx2 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);

		System.out.println("Enter the Number: ");

		int num = sc.nextInt();
		
		// Outer loop
		for (int i=1;i<num ;i++ )
		{
			for (int j=1;j<num ;j++ )
			{
				System.out.print(j);
			}
				System.out.println();
		}
	}
}
