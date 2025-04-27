import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many number : ");
        int num = sc.nextInt();

        int arr[] = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < num - 1; i++) {
            int minIndex = i;
        
            for (int j = i + 1; j < num; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        
        for (int i = 0; i < num; i++) {
            System.out.println("sort : " + arr[i]);
        }
        sc.close();
    }
}
