<<<<<<< HEAD
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int store = num;
        int fin = store;
        int count = 0;
        int size = 0;
        int ans = 0;
        while (num > 0) {
            count = num%10;
            num = num/10;
            size ++;
        }
        while (store > 0) {
            count = store%10;
            ans = ans +(int) Math.pow(count, size);
            store = store/10;
        }
        if(fin == ans){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
        sc.close();
    }
}
=======
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int store = num;
        int fin = store;
        int count = 0;
        int size = 0;
        int ans = 0;
        while (num > 0) {
            count = num%10;
            num = num/10;
            size ++;
        }
        while (store > 0) {
            count = store%10;
            ans = ans +(int) Math.pow(count, size);
            store = store/10;
        }
        if(fin == ans){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
        sc.close();
    }
}
>>>>>>> 5f4c20a56f0dfffb0de3127497444d6ec4ed73a3
