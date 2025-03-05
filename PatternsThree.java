import java.util.Scanner;
class PatternsThree 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number: ");
		int a=sc.nextInt();
		System.out.println("Enter thr Charactr");
		char ch = sc.next().charAt(0);

		for (int i=1;i<=a ;i++ )
		{
			for (int j=1;j<=a ;j++ )
			{
				if (i%2==0)
				{
					System.out.print(ch +" ");
				}else
					System.out.print(a +" ");
			}
			if (i%2==0)
			{
				ch++;
			}else{
				a++;
			}
			System.out.println();
		}
	}
}
