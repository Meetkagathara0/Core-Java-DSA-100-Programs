import java.util.Scanner;
public class SumOfEven{
	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many number you enter");
		int num = sc.nextInt();

		int arr[] = new int[num];
		for(int i=0; i<num; i++){
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<num; i++){
			if(arr[i] %2 == 0){
				sum = sum + arr[i];
			}
		}
		System.out.print("sum of even is :"+sum);

		sc.close();
	}
}