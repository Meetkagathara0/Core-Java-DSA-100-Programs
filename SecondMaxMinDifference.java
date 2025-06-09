import java.util.Scanner;

public class SecondMaxMinDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a size of array");
        int size = sc.nextInt();

        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        int max = 0;

        for(int i=0; i<size; i++){
            if(arr[i] >= max){
                max = arr[i]; 
            }
        }
        int min = max;

        for(int i=0; i<size; i++){
            if(arr[i] <= min){
                min = arr[i]; 
            }
        }int m = 0;

        for(int i=0; i<size; i++){
            if(arr[i] >= m && arr[i] != max){
                m = arr[i]; 
            }
        }
        int n = m;
        for(int i=0; i<size; i++){
            if(arr[i] <= n && arr[i] != min){
                n = arr[i]; 
            }
        }System.out.println("diffrance is " + (m-n));
    }
}
