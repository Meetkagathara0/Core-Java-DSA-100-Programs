<<<<<<< HEAD
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many number : ");
        int num = sc.nextInt();

        int arr[] = new int[num];

        int flip = 0;

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < num - 1; i++) {
            for (int j = 0; j < num - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    flip = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = flip;
                }
            }
        }

        for (int i = 0; i < num; i++) {
            System.out.println("sort : " + arr[i]);
        }
    }
}
=======
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many number : ");
        int num = sc.nextInt();

        int arr[] = new int[num];

        int flip = 0;

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < num - 1; i++) {
            for (int j = 0; j < num - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    flip = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = flip;
                }
            }
        }

        for (int i = 0; i < num; i++) {
            System.out.println("sort : " + arr[i]);
        }
    }
}
>>>>>>> 5f4c20a56f0dfffb0de3127497444d6ec4ed73a3
