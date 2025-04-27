import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
		int num = sc.nextInt();
        int count = 2;

        while(count >= 1){
            num = num - 2;
            count = num;
            if(count == 0){
                System.out.println("Even number");
                break;
            }
            else if(count == 1){
                System.out.println("odd number");
                break;
            }
            else if(count < 0){
                System.out.println("odd number");
                break;
            }
        }
        sc.close();
    }
}
