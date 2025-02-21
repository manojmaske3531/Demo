import java.util.Scanner;
class NumberPatternex1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number: ");
			// Input The Value
		int num = sc.nextInt();
			// Outre Loop
		for (int i=1;i<num ;i++ )
		{    
			// Inner Loop
			for (int j=1;j<num ;j++ )
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
