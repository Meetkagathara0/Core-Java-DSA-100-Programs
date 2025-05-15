import java.util.Scanner;

public class MaxSumWithEqualDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("enter a array number");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int max = -1;

        for (int i = 0; i < size; i++) {
            int sum1 = digitSum(arr[i]);
            for (int j = i + 1; j < size; j++) {
                int sum2 = digitSum(arr[j]);
                if (sum1 == sum2) {
                    int tempSum = arr[i] + arr[j];
                    if (tempSum > max) {
                        max = tempSum;
                    }
                }
            }
        }

        System.out.println("Max is: " + max);
        sc.close();
    }
    public static int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
