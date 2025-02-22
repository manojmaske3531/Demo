import java.util.Scanner;
class AlphabetPattern
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");

		char c = sc.next().charAt(0);
		int num = sc.nextInt();

		for (int i=1;i<num ;i++ )
		{
			char ch1 = c;
			for (int j=1;j<num ;j++ )
			{
				if(i>=j)
					System.out.print(ch1++ +" ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
