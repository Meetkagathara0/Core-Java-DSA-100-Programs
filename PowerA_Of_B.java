import java.util.Scanner;

public class PowerA_Of_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        System.out.print("Enter power of number : ");
        int pow = sc.nextInt();
        int num1 = num;
        int store = 0;
        int ans = 0;
        for(int i=1; i<pow; i++){
            for(int j=1; j<=num1; j++){
                store = store + num;
            }
            num = store;
            ans = store;
            store = 0;
        }
        System.out.println("answer is : "+ans);
        sc.close();
    }
}
