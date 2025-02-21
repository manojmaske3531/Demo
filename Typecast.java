import java.util.Scanner;
class Typecast
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("inter the number");
        int num = sc.nextInt();

        if(num%3==0&&num%5==0) {
            System.out.println("Tanu or manu wed's ");
        } else if (num%3==0) {
            System.out.println("Tanu");
        } else if (num%5==0){
            System.out.println("Manu");
        } else {
            System.out.println("Not Divisible");
        }

    }
}