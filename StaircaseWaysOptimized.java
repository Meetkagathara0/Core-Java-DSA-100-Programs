import java.util.Scanner;

public class StaircaseWaysOptimized {
    public static int countWays(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int prev1 = 1;
        int prev2 = 1;
        int current = 0;

        for (int i = 2; i <= n; i++) {
            current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }

        return current;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of steps: ");
        int n = sc.nextInt();

        int ways = countWays(n);
        System.out.println("Total number of ways to climb: " + ways);

        sc.close();
    }
}
