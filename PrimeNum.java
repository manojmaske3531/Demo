public class PrimeNum {
    public static void main(String[]args) {
        int n = 1;
        int m =25;
        for(int i=n; i<=m; i++) {
            int count=0;
            for(int j=2; j<i; j++) {
                if(i%j==0){
                    count++;
                }
            }
            if(count==0)
            System.out.println(i);

        }
    }
} 