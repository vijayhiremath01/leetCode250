import java.util.Scanner;

/*
 * Problem: Add Digits (LeetCode 258)
 *
 * Given an integer, repeatedly add all of its digits until
 * the result contains only a single digit.
 *
 * Example:
 * Input  : 38
 * Output : 2
 *
 * Explanation:
 * 38 -> 3 + 8 = 11
 * 11 -> 1 + 1 = 2
 *
 * ------------------------------------------------------------
 * Approach Used:
 * 1. Calculate the sum of all digits.
 * 2. If the sum is a single digit, return it.
 * 3. Otherwise, recursively repeat the same process.
 *
 * Time Complexity  : O(d)
 *                   (d = number of digits processed)
 * Space Complexity : O(r)
 *                   (r = recursion depth, which is very small)
 *
 * ------------------------------------------------------------
 * Follow-Up (O(1) Mathematical Solution):
 *
 * if (num == 0)
 *     return 0;
 *
 * return 1 + (num - 1) % 9;
 *
 * This solution is based on the Digital Root property.
 */

public class AddDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read input from the user
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Edge Case:
        // If the number is 0, its digital sum is also 0.
        if (num == 0) {
            System.out.println("The single digit number is: 0");
            sc.close();
            return;
        }

        // Start the recursive process
        int result = add(num, 0, 0);

        // Display the final result
        System.out.println("The single digit number is: " + result);

        sc.close();
    }

    /**
     * Recursively reduces a number to a single digit.
     *
     * @param num Current number
     * @param sum Stores the sum of digits
     * @param rem Stores the current extracted digit
     * @return Single digit result
     */
    public static int add(int num, int sum, int rem) {

        // Base Case:
        // If the number already has one digit,
        // no further processing is required.
        if (num < 10) {
            return num;
        }

        // Extract every digit and calculate its sum
        while (num != 0) {
            rem = num % 10;
            sum += rem;
            num /= 10;
        }

        // Prepare for the next recursive call
        num = sum;
        sum = 0;
        rem = 0;

        // Continue until a single digit is obtained
        return add(num, sum, rem);
    }
}