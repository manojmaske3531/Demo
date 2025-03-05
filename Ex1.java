import java.util.Scanner;
class Ex1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Char: ");
		char c = sc.next().charAt(0);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
        int n=4;
		for (int i=1;i<=n ;i++ )
		{
			for (int j=1;j<=n ;j++ )
			{
				if(i>=j){
					if(i%2==0)
					System.out.print(c++ +" ");
				else
					System.out.print(num++ +" ");
				}
				else{
					System.out.print("  ");
				}
			}	
			System.out.println();
		}
	}
}