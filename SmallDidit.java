class SmallDidit 
{
	public static void main(String[] args) 
	{
		int num= 653152;
		int small =num%10;
		int rem =0;
		
		while(num>0){
			rem=num%10;
			if(rem<small) {
				small=rem;
			}
			num=num/10;

		}
		System.out.println("The Smalest digit is: "+small);
	}
}
