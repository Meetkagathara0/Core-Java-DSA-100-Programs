import java.util.Scanner;

public class RotateArrayRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter k (right rotations): ");
        int k = sc.nextInt();

        // Sanitize k
        k = k % n;

        // Store last k elements
        int[] temp = new int[k];
        for(int i = 0; i < k; i++) {
            temp[i] = arr[n - k + i];
        }

        // Shift remaining elements to the right
        for(int i = n - 1; i >= k; i--) {
            arr[i] = arr[i - k];
        }

        // Copy back temp into start
        for(int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }

        System.out.println("Array after rotation:");
        for(int i : arr) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}