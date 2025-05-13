import java.util.Arrays;
import java.util.Scanner;

public class Permutations {
    static void printPermutations(int[] arr, int start) {
        if (start == arr.length - 1) {
            System.out.println(Arrays.toString(arr));
            return;
        }

        for (int i = start; i < arr.length; i++) {
            int temp = arr[start];
            arr[start] = arr[i];
            arr[i] = temp;
            printPermutations(arr, start + 1);

            temp = arr[start];
            arr[start] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();

        int[] input = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }
        printPermutations(input, 0);
    }
}
