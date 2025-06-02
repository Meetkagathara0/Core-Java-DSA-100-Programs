import java.util.Scanner;

public class SwastikaPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a row and coloumn size :");
        int size = sc.nextInt();
        int t = size / 2;

        System.out.print("* ");
        for (int i = 1; i <= t - 1; i++) System.out.print("  ");
        for (int i = 1; i <= t+1; i++) System.out.print("* ");

        System.out.println();
        for (int i = 1; i <= t; i++) {
            for (int j = 1; j <= 1; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= t - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= size; i++) System.out.print("* ");
        System.out.println();
        for (int i = 1; i <= t; i++) {
            for (int j = 1; j <= t; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 1; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= t - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= t+1; i++) System.out.print("* ");
        for (int i = 1; i <= t - 1; i++) System.out.print("  ");
        System.out.print("* ");
        
        
    }
}
