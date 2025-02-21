class  Happy_Or_sadnumber
// note -> the sum of each digit squre wiil bre equal tu 1 the it is happy number else   
// sum ==4 the it is sad number
{
	public static void main(String[] args) 
	{
		int num=32;
		int sum=0;  
        while(num!=0)
		{
			int rem=num%10;
			int  sq=rem*rem;
			sum=sum+sq;
			num=num/10;
		}
		if (sum==1){
		System.out.println("happy Number");
		break;
		}
		else if(sum==4) {
		System.out.println("Sad Number");
		break;
		}
		num=sum;
	}
	}
	
