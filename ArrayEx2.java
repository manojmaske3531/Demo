import java.util.Scanner;
class ArrayEx2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number: ");
        
			int size = sc.nextInt();
			int numbers [] = new int [size];
			// input
			for (int i=0;i<size ;i++ )
			{
				numbers[i]=sc.nextInt();
			}
				// Output
			for (int i=0;i<=size ;i++ )
			{
				System.out.println(numbers[i]);
			}
	}
}
