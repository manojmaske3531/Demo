public class PrimeNumberorNot {
    public static void main(String[]args) {
        int num= 7;
         int count=0;
        for (int i=1; i<=num; i++) {
            if(num%i==0) {
                count++;
            }
        }
        System.out.println("count is:"+count);
        if(count==2)
        System.out.println(num+"is prinme number");
        else
        System.out.println(num+"is not a prime number");

    }
}