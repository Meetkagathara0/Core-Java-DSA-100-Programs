import java.util.Scanner;

public class CheckNonDecreasingWithOneChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int num = sc.nextInt();
        int arr[] = new int[num];
        int count = 0;

        System.out.println("Enter array elements:");
        for(int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < num - 1; i++) {
            if(arr[i] > arr[i+1]) {
                count++;

                if (count > 1) {
                    break;
                }

                if (i == 0 || arr[i - 1] <= arr[i + 1]) {
                    arr[i] = arr[i + 1]; // change current element
                } else {
                    arr[i + 1] = arr[i]; // change next element
                }
            }
        }

        if(count <= 1) {
            System.out.println("non decreasing");
        } else {
            System.out.println("decreasing");
        }

        sc.close();
    }
}
