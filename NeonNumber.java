public class NeonNumber {
    public static void main(String[]args) {
        int num = 9;
        int num1=num*num;
        int sum =0;
        while(num!=0){
            sum == sum+num1%10 ;
            num1=num1/10;
        }
        if(num==sum)
        System.out.println(num+"is neon number");
        else
        System.out.println(num+"is not neon number");
    }
}