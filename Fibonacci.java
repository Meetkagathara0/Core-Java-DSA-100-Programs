<<<<<<< HEAD
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        int a = 0;
        int b = 1;
        int next = 0;

        for(int i=0; i<=num ; i++){
            next = a + b ;
            System.out.println(next);
            a = b ;
            b = next ;
        }
        sc.close();
    }
=======
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        int a = 0;
        int b = 1;
        int next = 0;

        for(int i=0; i<=num ; i++){
            next = a + b ;
            System.out.println(next);
            a = b ;
            b = next ;
        }
        sc.close();
    }
>>>>>>> 5f4c20a56f0dfffb0de3127497444d6ec4ed73a3
}