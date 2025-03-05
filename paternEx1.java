import java.util.Scanner;
class paternEx1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter The Number: ");

		int num=sc.nextInt();


		for (int i=0;i<num ;i++ )
			
		{
			char ch = 'A';
			for (int j=0;j<num ;j++ )
			{
				if(i+j>=num+1) {
					System.out.print(ch +" ");
				}
					else{
						System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	}

