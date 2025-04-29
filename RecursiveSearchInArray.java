import java.util.Scanner;

public class RecursiveSearchInArray {

    public static int isInArray(int[] a, int m, int index) {
        
        return 0; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("Enter number to search: ");
        int m = sc.nextInt();

        int result = isInArray(a, m, 0);

        if (result == 1) {
            System.out.println("Number is present in array.");
        } else {
            System.out.println("Number is not present in array.");
        }

        sc.close();
    }
}
