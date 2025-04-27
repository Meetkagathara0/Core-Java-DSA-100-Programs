<<<<<<< HEAD
import java.util.Scanner;

public class DecimalToBcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int num = sc.nextInt();

        StringBuilder bcd = new StringBuilder();

        int original = num; // to show input later

        // If number is 0, handle separately
        if (num == 0) {
            bcd.append("0000");
        }

        // Process each digit
        while (num > 0) {
            int digit = num % 10; // Get last digit
            String binary = Integer.toBinaryString(digit); // Convert to binary
            String bcdDigit = String.format("%4s", binary).replace(' ', '0'); // Pad to 4 bits
            bcd.insert(0, bcdDigit + " "); // Add to front (reverse order)
            num = num / 10;
        }

        System.out.println("BCD of " + original + " = " + bcd.toString().trim());

        sc.close();
    }
}
=======
import java.util.Scanner;

public class DecimalToBcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int num = sc.nextInt();

        StringBuilder bcd = new StringBuilder();

        int original = num; // to show input later

        // If number is 0, handle separately
        if (num == 0) {
            bcd.append("0000");
        }

        // Process each digit
        while (num > 0) {
            int digit = num % 10; // Get last digit
            String binary = Integer.toBinaryString(digit); // Convert to binary
            String bcdDigit = String.format("%4s", binary).replace(' ', '0'); // Pad to 4 bits
            bcd.insert(0, bcdDigit + " "); // Add to front (reverse order)
            num = num / 10;
        }

        System.out.println("BCD of " + original + " = " + bcd.toString().trim());

        sc.close();
    }
}
>>>>>>> 5f4c20a56f0dfffb0de3127497444d6ec4ed73a3
