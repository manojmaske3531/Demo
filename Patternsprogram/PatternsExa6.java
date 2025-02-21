import java.util.Scanner;

class PatternsExa6 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The size: ");
		int num = sc.nextInt();
		
		// Outer Loop
		for (int i=0;i<=num ;i++ )
		{
			// Inner loop
			for (int j= num-1;j>0 ;j-- )
			{
				if(j > i) {
					System.out.print(" ");
				} else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		
	}
}
