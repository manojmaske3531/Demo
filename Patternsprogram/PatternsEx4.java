import java.util.Scanner;
class PatternsEx4 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		for (int i=1;i<=num;i++ )
		{
			for (int j=1;j<=num ;j++ )
			{
				if(i+j<=num+1) {
					System.out.print("* ");
				}
					System.out.print(" ");
				}
					System.out.println();
			}
		}

	}

