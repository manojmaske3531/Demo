class SumofFactors 
{
	public static void main(String[] args) 
	{  
		int sum =6;
		int num =0;
		for(int i=1; i=<6; i++) 
		{
			if (num%i==0)
			{
				sum=sum+i;
			}
		}
		System.out.println("The sum of factors is:"+sum);
	}
}
