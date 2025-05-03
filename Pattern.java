// import java.util.Scanner;
// 1 
// 12
// 123
// public class Pattern {
//     public static void main(String[] args){
//         for(int i=0; i<=4; i++){
//             for(int j=1 ; j<=i+1; j++){
//                 System.out.print(j);
//             }
//             System.out.println(" ");
//         }
//     }
// }

// 1 
// A B 
// 2 3 4 
// C D E F
// public class Pattern {
//     public static void main(String[] args) {
//         int rows = 4;
//         int num = 1;
//         char ch = 'A';

//         for (int i = 1; i <= rows; i++) {
//             for (int s = rows - i; s > 0; s--) {
//                 System.out.print(" ");
//             }

//             for (int j = 1; j <= i; j++) {
//                 if (i % 2 == 1) {
//                     System.out.print(num + " ");
//                     num++;
//                 } else {
//                     System.out.print(ch + " ");
//                     ch++;
//                 }
//             }
//             System.out.println();
//         }
//     }
// }


// *****
//  ***
//   *

// public class Pattern {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter a number");
//         int num = sc.nextInt();
//         int n = (num/2) + 1;
//         int temp = 1;
//         for(int i=1 ; i<=n ; i++){
//             for(int k=1; k<i; k++){
//                 System.out.print(" ");
//             }
//             for(int j=temp ; j<=num; j++){
//                 System.out.print("*");
//             }
//             temp +=2;
//             System.out.println();
//         }
//     }
// }

// ******
// **  **
// *    *
// public class Pattern {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("how many line print :");
//         int num = sc.nextInt();
//         int temp = num;
//         int temp2 = 1;
//         for(int i=1; i<=num; i++){
//             for(int j=temp; j>=1; j--){
//                 System.out.print("*");
//             }
//             for(int k=1; k<i; k++){
//                 System.out.print("  ");
//             }
//             for(int j=temp2; j<=num; j++){
//                 System.out.print("*");
//             }
//             temp-=1;
//             temp2+=1;
//             System.out.println("");
//         }
//     }
// }