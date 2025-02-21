// A palindrime number is a number that remains the same when its digits are reversed.like 16461

import java.util.Scanner;
class Pelindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");

		int num=sc.nextInt();
		int org_num=num;
		int rev=0;

		while (num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		if(org_num==rev)
			{
				System.out.println(org_num+" palindrome Number");
			}
			else
		{
			System.out.println(org_num+" Not palindrome Number");
		}
	}
}
