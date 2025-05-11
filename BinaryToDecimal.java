import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("enter a number");
        int num = sc.nextInt();

        int cal = 1;
        int sum = 0;
        int temp = 0;

        while (num!=0) {
            temp = num%10;
            if(temp == 1 ){
                sum = sum + cal;
                cal = cal * 2;
            }
            else{
                cal = cal * 2;
            }
            num = num / 10;
        }
        System.out.println(sum);
    }
}
