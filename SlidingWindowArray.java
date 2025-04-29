import java.util.Scanner;

public class SlidingWindowArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many number for array :");
        int num = sc.nextInt();
        int arr[] = new int[num];
        for(int i=0; i<num; i++){
            System.out.println("enter " +i+ " element");
            arr[i] = sc.nextInt();
        }

        System.out.println("enter a window size :");
        int winR = sc.nextInt();

        int max = 0;
        int sum = 0;
        for(int i=0; i<num; i++){
            for(int j=i; j<winR; j++){
                sum = sum + arr[j];
            }
            for(int k=i; k<winR; k++){
                if(arr[k]>max){
                    max = arr[k];
                }
            }
            System.out.println("current sum : "+sum);
            System.out.println("Max : "+max);
            winR++;
            sum = 0;
        }
        sc.close();
    }
}
