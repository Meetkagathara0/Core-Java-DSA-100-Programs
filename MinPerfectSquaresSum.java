import java.util.Scanner;

public class MinPerfectSquaresSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int add = 0;
        
        while (num > 0) {
            int sqrt = (int) Math.sqrt(num);
            int square = sqrt * sqrt;
            num = num - square;
            add++;
        }

        System.out.println("Minimum Perfect Squares: " + add);
        sc.close();
    }
}
