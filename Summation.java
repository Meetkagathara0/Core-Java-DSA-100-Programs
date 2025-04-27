import java.util.Scanner;

// public class Summation{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number :");
//         int num = sc.nextInt();
//         int count = 0;
//         while (num > 0) {
//             count = count + num%10;
//             num = num/10;
//         }
//         System.out.println(count);
//         sc.close();
//     }
// }

public class Summation{
    static int count = 0;
    public static void RecSummation(int num){
        if(num == 0){
            return;
        }
        else{
            count = count + num%10;
            RecSummation(num/10);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();
        RecSummation(num);
        System.out.println(count);
        sc.close();
    }
}