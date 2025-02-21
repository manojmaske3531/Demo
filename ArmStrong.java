class ArmStrong 
{
    public static void main(String[]args) 
    {
        int num = 1634;//0
        int num1 =0;//123//12//1//0
        int num2 = num;
        int count = 0;//4//3
        int sum=0;//27//32//36

        while(num!=0) {
            count++;
            num=num/10;
        }
        while(num1!=0) {
            int ld=num1%10;//3//2//1
            int temp = 1;//1//1//1
            for(int i=1;i<=count;i++) {
                temp=temp*ld;
            }
            if(num2==sum){
                System.out.println("Armstrong Number");
            }
            else {
                System.out.println("Not An Armstrong");
            }
        }
    }
}