import java.util.Scanner;

public class CountOddEvenDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = sc.nextInt();

        int odd = 0;
        int even = 0;
        int temp = 0;

        while (num > 0) {
            temp = num % 10;
            if (temp % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            num = num/10;
        }

        System.err.println("even count is : "+even);
        System.err.println("odd count is : "+odd);
    }
}
