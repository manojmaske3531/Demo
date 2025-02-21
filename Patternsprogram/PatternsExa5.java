import java.util.Scanner;
class PatternsExa5 
{
	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");

		int num = sc.nextInt();
		 // Outer Loop
		 for (int i=1;i<=num ;i++ )
		 {
			 // inner Loop
			 for (int j=1;j<=num ;j++ )
			 {
				 // cell cundition
				 if(i==1||j==1||j==1||i==num||j==num||i+j==num+1) 
				 System.out.print("* ");
				 else
					 System.out.print("  ");
			 }
					System.out.println();
		 }
	}
}
			
