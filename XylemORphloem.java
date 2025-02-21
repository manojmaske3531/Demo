// watj p the given number is xylom or phelome
// note the sume of frist number or last digits = sum of midde digit then it is xylome else it is pholem
class xylomorPhelome
 
{
	public static void main(String[] args) 
	{
		int num = 1234;
		int rem =num%10;
		num =num/10;
		while(num>9) {
			is = is + num%10;
			num= num/10;
		}
		int os= num+rem;
		if(is==os)
		{

		System.out.println("The number is Xylom: ");
		}
		else{
			System.out.println("The number pheloem: ");
		}
	}
}
