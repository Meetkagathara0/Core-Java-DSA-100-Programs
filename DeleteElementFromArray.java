import java.util.Scanner;

public class DeleteElementFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many numbers: ");
        int num = sc.nextInt();
        int arr[] = new int[num+1];

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("where in array enter element:");
        int element = sc.nextInt();
        System.out.println("enter a number for insert in :"+ element +" position");
        int num1 = sc.nextInt();

        for(int i=num; i>=element-1; i--){
            arr[i] = arr[i-1];
        }
        
        arr[element-1] = num1;

        for(int i=0; i<=num; i++){
            System.out.print(" "+arr[i]+" ");
        }
    }
}
