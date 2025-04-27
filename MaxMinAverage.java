import java.util.Scanner;

public class MaxMinAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many numbers: ");
        int num = sc.nextInt();

        int data = 0;
        int average = 0;
        int min = 0;
        int max = 0;

        for (int i = 1; i <= num; i++) {
            data = sc.nextInt();

            average = average + data;

            // First number set as both min & max
            if (i == 1) {
                min = data;
                max = data;
            }

            if (data > max) {
                max = data;
            }

            if (data < min) {
                min = data;
            }
        }

        System.out.println("Average of Numbers is: " + (average / num));
        System.out.println("Maximum of Numbers is: " + max);
        System.out.println("Minimum of Numbers is: " + min);

        sc.close();
    }
}
