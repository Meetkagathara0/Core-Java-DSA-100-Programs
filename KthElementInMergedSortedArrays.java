import java.util.Scanner;

public class KthElementInMergedSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of array 1:");
        int a1 = sc.nextInt();
        System.out.println("Enter a array 1 elements:");
        int arr1[] = new int[a1];
        for (int i = 0; i < a1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter a size of array 2:");
        int a2 = sc.nextInt();
        System.out.println("Enter a array 2 elements:");
        int arr2[] = new int[a2];
        for (int i = 0; i < a2; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println("Enter a k:");
        int k = sc.nextInt();

        int[] merged = new int[a1 + a2];
        for (int i = 0; i < a1; i++) {
            merged[i] = arr1[i];
        }
        for (int i = 0; i < a2; i++) {
            merged[a1 + i] = arr2[i];
        }
        int temp = 0;
        for (int i = 0; i < merged.length; i++) {
            for (int j = i + 1; j < merged.length; j++) {
                if (merged[i] > merged[j]) {
                    temp = merged[i];
                    merged[i] = merged[j];
                    merged[j] = temp;
                }
            }
        }

        System.out.println("K elements is " + merged[k - 1]);

    }
}
