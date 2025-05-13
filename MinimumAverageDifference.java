import java.util.Scanner;

public class MinimumAverageDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int n = 0;
        int a = 0;
        int ans = 0;
        int sum = 0;
        int minIndex = 0;
        int minDiff = Integer.MAX_VALUE;

        for (int j = 0; j < size; j++) {
            sum += arr[j];
        }
        for (int i = 0; i < size; i++) {
            a = 0;
            for (int j = 0; j <= n; j++) {
                a += arr[j];
            }
            int remainingSum = 0;
            for (int j = n + 1; j < size; j++) {
                remainingSum += arr[j];
            }
            int leftAvg = a / (n + 1);

            int rightAvg = 0;
            if (n < size - 1) {
                rightAvg = remainingSum / (size - n - 1);
            }
            if (leftAvg > rightAvg) {
                ans = leftAvg - rightAvg;
            } else {
                ans = rightAvg - leftAvg;
            }
            if (ans < minDiff) {
                minDiff = ans;
                minIndex = n;
            }
            System.out.println("Index " + n + " Difference: " + ans);
            n++;
        }

        System.out.println("Minimum average difference index: " + minIndex);
        sc.close();
    }
}
