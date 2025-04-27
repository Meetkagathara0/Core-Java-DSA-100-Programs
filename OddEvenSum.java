import java.util.Scanner;

public class OddEvenSum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();
        int count = 0;
        int odd = 0;
        int even = 0;
        while (num > 0) {
            count = num%10;
            num = num/10;
            if(count%2==0){
                even += count; 
            }else{
                odd += count;
            }
        }
        System.out.println(odd);
        System.out.println(even);
        sc.close();
    }
}
