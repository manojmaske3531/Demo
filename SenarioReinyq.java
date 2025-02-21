import java.util.*;
public class SenarioReinyq {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);

        // Aslk the wether coundition
        System.out.println("It is rainy..?");
        String wether = sc.next();
        
        if(wether=="yes"){
            System.out.println("you shud go by csr");
        }
        else if(wether=="No") {
            System.out.println("you shud go bike");
        }


        
    }
    
}
