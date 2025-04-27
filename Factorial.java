// //iterative method
// import java.util.Scanner;

// public class Factorial{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a factorial number : ");
//         int num = sc.nextInt();
//         int count = 1;
//         for(int i=1 ; i<=num; i++){
//             count = count * i;
//         }
//         System.out.println("factorial of " + num + " is " + count);
//         sc.close();
//     }
// }

import java.util.Scanner;

public class Factorial{
    static int count = 1;
    public static void factNum(int i , int num){
        if(i>num){
            return;
        }
        count = count * i;
        factNum(i + 1, num);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a factorial number : ");
        int num = sc.nextInt();
        factNum(1, num);
        System.out.println(count);
        sc.close();
    }
}