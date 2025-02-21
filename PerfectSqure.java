public class PerfectSqure {
    public static void main(String[]args){
        int a = 1;
        int pro = 0;
        for(int i=1; i<=a;i++){
            if(i*1==a){
                pro=i*i;
                break;                
            }
        }
        if(pro==a){
            System.out.println("pefectNumber");
        } else {
            System.out.println("Not a perfectNumber");

        }
        
    }
}