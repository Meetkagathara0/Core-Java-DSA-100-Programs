<<<<<<< HEAD
import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Matrix A dimensions
        System.out.print("Enter number of rows for Matrix A: ");
        int rowA = sc.nextInt();
        System.out.print("Enter number of columns for Matrix A: ");
        int colA = sc.nextInt();

        // Matrix B dimensions
        System.out.print("Enter number of rows for Matrix B: ");
        int rowB = sc.nextInt();
        System.out.print("Enter number of columns for Matrix B: ");
        int colB = sc.nextInt();

        // Check multiplication rule
        if (colA != rowB) {
            System.out.println("Matrix multiplication not possible! Columns of A must equal Rows of B.");
            return;
        }

        // Declare matrices
        int[][] A = new int[rowA][colA];
        int[][] B = new int[rowB][colB];
        int[][] result = new int[rowA][colB];

        // Input for Matrix A
        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < colA; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // Input for Matrix B
        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < rowB; i++) {
            for (int j = 0; j < colB; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // Matrix Multiplication
        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < colB; j++) {
                result[i][j] = 0;
                for (int k = 0; k < colA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Output result matrix
        System.out.println("Result of Matrix Multiplication:");
        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < colB; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
=======
import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Matrix A dimensions
        System.out.print("Enter number of rows for Matrix A: ");
        int rowA = sc.nextInt();
        System.out.print("Enter number of columns for Matrix A: ");
        int colA = sc.nextInt();

        // Matrix B dimensions
        System.out.print("Enter number of rows for Matrix B: ");
        int rowB = sc.nextInt();
        System.out.print("Enter number of columns for Matrix B: ");
        int colB = sc.nextInt();

        // Check multiplication rule
        if (colA != rowB) {
            System.out.println("Matrix multiplication not possible! Columns of A must equal Rows of B.");
            return;
        }

        // Declare matrices
        int[][] A = new int[rowA][colA];
        int[][] B = new int[rowB][colB];
        int[][] result = new int[rowA][colB];

        // Input for Matrix A
        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < colA; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // Input for Matrix B
        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < rowB; i++) {
            for (int j = 0; j < colB; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // Matrix Multiplication
        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < colB; j++) {
                result[i][j] = 0;
                for (int k = 0; k < colA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Output result matrix
        System.out.println("Result of Matrix Multiplication:");
        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < colB; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
>>>>>>> 5f4c20a56f0dfffb0de3127497444d6ec4ed73a3
