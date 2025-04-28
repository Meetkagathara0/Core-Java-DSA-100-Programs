import java.util.Scanner;

public class CountingSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many numbers: ");
        int num = sc.nextInt();
        int arr[] = new int[num];

        System.out.println("Enter the numbers:");
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 1: Find maximum element
        int max = arr[0];
        for (int i = 1; i < num; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Step 2: Create count array
        int[] count = new int[max + 1];

        // Step 3: Store counts
        for (int i = 0; i < num; i++) {
            count[arr[i]]++;
        }

        // Step 4: Rebuild sorted array
        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }

        // Output sorted array
        System.out.println("Sorted array:");
        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
