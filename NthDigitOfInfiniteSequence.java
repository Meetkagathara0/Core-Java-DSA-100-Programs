import java.util.Scanner;

public class NthDigitOfInfiniteSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        StringBuilder seq = new StringBuilder();
        int i = 1;
        while (seq.length() < n) {
            seq.append(i);
            i++;
        }

        System.out.println("Nth Digit: " + seq.charAt(n - 1));
        
        sc.close();
    }
}
