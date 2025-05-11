import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter matrix size: ");
        int size = sc.nextInt();

        int[][] arr1 = new int[size][size];
        System.out.println("Enter matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        int a = 0;
        for (int k = 0; k < size; k++) {
            for (int i = 0; i < size; i++) {
                for (int j = a; j <= a; j++) {
                    System.out.print(arr1[i][j] + " ");
                }
            }
            a++;
            System.out.println();
        }
    }
}
