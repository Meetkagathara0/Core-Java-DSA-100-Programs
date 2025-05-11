import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        StringBuilder binary = new StringBuilder();

        while (num != 0) {
            int temp = num % 2;
            binary.append(temp); 
            num = num / 2;
        }

        System.out.println("Binary: " + binary.reverse().toString());
        sc.close();
    }
}
