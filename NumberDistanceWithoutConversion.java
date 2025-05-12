import java.util.Scanner;

public class NumberDistanceWithoutConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter a second number: ");
        int num2 = sc.nextInt();
        
        int ans = num1 ^ num2;
        int count = 0;
        
        while (ans > 0) {
            count += ans & 1;
            ans >>= 1;
        }

        System.out.println("Distance is: " + count);
        
        sc.close();
    }
}
