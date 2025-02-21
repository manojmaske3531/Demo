import java.util.Scanner;

public class BinaryToHex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for binary input
        System.out.print("Enter a binary number: ");
        String binary = scanner.nextLine();
        
        // Convert binary to decimal
        int decimal = Integer.parseInt(binary, 2);
        
        // Convert decimal to hexadecimal
        String hex = Integer.toHexString(decimal).toUpperCase();
        
        // Display the result
        System.out.println("Hexadecimal equivalent: " + hex);
        
        scanner.close();
    }
}
