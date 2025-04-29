// //Simple Square  

// import java.util.Scanner;

// public class SquareRootWithoutFunction {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter a number : ");
//         int num = sc.nextInt();

//         for(int i=1; i<=num; i++){
//             if(i*i==num){
//                 System.out.println("Square root of "+num+ " is "+i);
//                 return;
//             }
//         }
//         System.out.println("this number is not for perfect square");
//         sc.close();
//     }
// }

import java.util.Scanner;

public class SquareRootWithoutFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        double left = 0;
        double right = num;
        double mid = 0;

        while ((right - left) > 0.00001) {
            mid = (left + right) / 2;
            if (mid * mid > num) {
                right = mid;
            } else {
                left = mid;
            }
        }
        System.out.println(mid);
        
        sc.close();
    }
}
