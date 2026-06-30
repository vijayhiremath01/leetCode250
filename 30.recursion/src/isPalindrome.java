import java.util.*;

public class isPalindrome {

    static int sum = 0;

    public static void reverse(int num) {

        // Base Condition
        if (num == 0) {
            return;
        }

        int rem = num % 10;
        sum = sum * 10 + rem;

        reverse(num / 10);
    }

    public static boolean isPal(int num) {

        int original = num;

        // reset sum before every call
        sum = 0;

        reverse(num);

        return original == sum;
    }

    public static void main(String[] args) {

        int num = 1210;

        if (isPal(num)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}