class Palindrome 
{
	public static void main(String[] args) 
	{
		int num = 28413;
		int rev = 0;
		intt rem = 0;
		 while(num!=0)
		{
			 rem=num%10;
			 rev=rev*10+rem;
			 num=num/10;
		}
		if (num==rev)
			System.out.println("palindrom");
		    else
				System.out.println("Not pelindrome");
		
	}
}
