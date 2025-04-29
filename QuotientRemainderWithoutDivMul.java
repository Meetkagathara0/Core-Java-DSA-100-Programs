import java.util.Scanner;

public class QuotientRemainderWithoutDivMul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number Dividend ");
        int Dividend = sc.nextInt();
        System.out.println("enter a number Divisor ");
        int Divisor = sc.nextInt();

        int store = Dividend%Divisor;

        int temp = Dividend - store;

        for(int i=1; i<=Divisor; i++){
            if(Divisor*i == temp){
                System.out.println("quotient is :" +i);
            }
        }
        System.out.println("reminder is :" +store);
        sc.close();
    }
}
