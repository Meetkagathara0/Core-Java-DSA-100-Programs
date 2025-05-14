import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AddTwoNumbersLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of L1 and L2:");
        int size = sc.nextInt();

        List<Integer> l1 = new LinkedList<>();
        System.out.println("Enter elements of L1:");
        for (int i = 0; i < size; i++) {
            l1.add(sc.nextInt());
        }

        List<Integer> l2 = new LinkedList<>();
        System.out.println("Enter elements of L2:");
        for (int i = 0; i < size; i++) {
            l2.add(sc.nextInt());
        }

        Collections.reverse(l1);
        Collections.reverse(l2);

        List<Integer> result = new LinkedList<>();
        int carry = 0;
        for (int i = 0; i < size; i++) {
            int sum = l1.get(i) + l2.get(i) + carry;
            result.add(sum % 10);
            carry = sum / 10;
        }

        if (carry > 0) {
            result.add(carry);
        }

        System.out.println("Sum: " + result);

        sc.close();
    }
}
