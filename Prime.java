<<<<<<< HEAD
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter last number : ");
        int num2 = sc.nextInt();
        int count = 0;

        for (int i=num1 ; i<=num2; i++){
            for(int j=1 ; j<=i ; j++){

                if(i%j == 0){
                    count ++; 
                }
            }
            if(count == 2){
                System.out.println(i);
            }
            count= 0;
        }
        sc.close();
    }
}
=======
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter last number : ");
        int num2 = sc.nextInt();
        int count = 0;

        for (int i=num1 ; i<=num2; i++){
            for(int j=1 ; j<=i ; j++){

                if(i%j == 0){
                    count ++; 
                }
            }
            if(count == 2){
                System.out.println(i);
            }
            count= 0;
        }
        sc.close();
    }
}
>>>>>>> 5f4c20a56f0dfffb0de3127497444d6ec4ed73a3
