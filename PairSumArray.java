import java.util.Scanner;

public class PairSumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers in array: ");
        int num = sc.nextInt();
        int arr[] = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("Enter " + i + " element: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("enter number for pair");
        int pair = sc.nextInt();
        int store = 0;
        int count = 0;

        for(int i=0; i<num; i++){
            for(int j=i+1; j<num; j++){
                if(i != j){
                    store = arr[i] + arr[j];
                    if(store==pair){
                        System.out.println("pair ("+arr[i]+ ","+arr[j]+" )");
                        count++;
                    }
                }
            }
        }
        System.out.println("count of pair is :"+count);
    }
}
