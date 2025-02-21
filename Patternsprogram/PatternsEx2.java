import java.util.Scanner;
class PatternsEx2 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");

		int num=sc.nextInt();
		// outer loop
		for(int i=1; i<=num; i++) {
			// inner loop
			for(int j=1; i<num; j++){
				if(j==1||i==num)
					System.out.println("* ");
				else 
					System.out.println(" ");
			}
			System.out.println();
		}

	}
}
