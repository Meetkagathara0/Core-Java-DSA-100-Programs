import java.util.Scanner;

public class SlidingWindowArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers in array: ");
        int num = sc.nextInt();
        int arr[] = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("Enter " + i + " element: ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter window size: ");
        int winR = sc.nextInt();

        int max = Integer.MIN_VALUE;
        int sum;

        for (int i = 0; i <= num - winR; i++) {
            sum = 0;
            for (int j = i; j < i + winR; j++) {
                sum += arr[j];
            }

            System.out.println("Current sum: " + sum);

            if (sum > max) {
                max = sum;
            }
            System.out.println("Maximum sum: " + max);
            System.out.println("");
        }
        sc.close();
    }
}
