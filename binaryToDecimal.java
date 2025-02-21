import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryString = sc.next();

        // Validate the input
        if (!binaryString.matches("[01]+")) {
            System.out.println("Invalid input! Please enter a valid binary number.");
        } else {
            // Convert binary string to decimal
            int decimalValue = Integer.parseInt(binaryString, 2);
            System.out.println("Decimal equivalent: " + decimalValue);
        }

        sc.close();
    }
}
