import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagramStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a first String");
        String s1 = sc.nextLine();
        
        System.out.println("enter a second String");
        String s2 = sc.nextLine();

        if (s1.length() != s2.length()){
            System.out.println("not anagrams");
            return;
        }

        char arr1[] = s1.toCharArray();
        char arr2[] = s1.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(Arrays.equals(arr1, arr2));
    }
}
