import java.util.Scanner;

public class RadixSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many numbers: ");
        int num = sc.nextInt();
        int arr[] = new int[num];

        // Input
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 1: Find maximum number
        int max = arr[0];
        for (int i = 1; i < num; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Step 2: Do counting sort for every digit
        int exp = 1; // 1 -> unit, 10 -> tens, 100 -> hundreds
        while (max / exp > 0) {
            countingSort(arr, num, exp);
            exp = exp * 10;
        }

        // Output
        System.out.println("Sorted array:");
        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }

    public static void countingSort(int[] arr, int num, int exp) {
        int output[] = new int[num];
        int count[] = new int[10]; // 0 to 9

        for (int i = 0; i < num; i++) {
            int digit = (arr[i] / exp) % 10;
            count[digit]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Step 3: Build output array
        for (int i = num - 1; i >= 0; i--) {
            int digit = (arr[i] / exp) % 10;
            output[count[digit] - 1] = arr[i];
            count[digit]--;
        }

        for (int i = 0; i < num; i++) {
            arr[i] = output[i];
        }
    }
}


