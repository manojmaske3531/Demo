public class Avragevalue {
    public static void main(String[]args){
        int num=48132;
        int sum=0;
        int rem=0;
        int count=0;
        while(num!=0) {
            rem=num%10;
            sum=sum+rem;
            num=num/10;
            count++;
        }
        System.out.println("the avrg of digit is: "+sum/count);
    }
}