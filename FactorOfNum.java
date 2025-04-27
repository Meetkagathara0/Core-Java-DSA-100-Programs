<<<<<<< HEAD
/*//iterative method
import java.util.Scanner;
public class FactorOfNum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number for Factor : ");
		int num = sc.nextInt();

		for(int i=1 ; i<=num ; i++){
			if(num%i == 0){
				System.out.print(i + " ");
			}
		}
	}
}*/
import java.util.Scanner;

public class FactorOfNum {
    
    public void printFactNumbers(int i, int n) {
        if (i > n) {
            return; 
        }
        if (n % i == 0) {
            System.out.print(i + " ");
        }
        printFactNumbers(i + 1, n); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        FactorOfNum ft = new FactorOfNum();
        ft.printFactNumbers(1, n); 
        sc.close();
    }
}
=======
/*//iterative method
import java.util.Scanner;
public class FactorOfNum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number for Factor : ");
		int num = sc.nextInt();

		for(int i=1 ; i<=num ; i++){
			if(num%i == 0){
				System.out.print(i + " ");
			}
		}
	}
}*/
import java.util.Scanner;

public class FactorOfNum {
    
    public void printFactNumbers(int i, int n) {
        if (i > n) {
            return; 
        }
        if (n % i == 0) {
            System.out.print(i + " ");
        }
        printFactNumbers(i + 1, n); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        FactorOfNum ft = new FactorOfNum();
        ft.printFactNumbers(1, n); 
        sc.close();
    }
}
>>>>>>> 5f4c20a56f0dfffb0de3127497444d6ec4ed73a3
