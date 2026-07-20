/**
 * Problem: Ugly Number (LeetCode 263)
 *
 * An ugly number is a positive integer whose prime factors
 * are limited to 2, 3, and 5.
 *
 * Approach:
 * 1. If the number is less than or equal to 0, it is not ugly.
 * 2. Repeatedly divide the number by 2 while it is divisible.
 * 3. Repeatedly divide the number by 3 while it is divisible.
 * 4. Repeatedly divide the number by 5 while it is divisible.
 * 5. If the remaining number becomes 1, then all of its prime
 *    factors were 2, 3, or 5.
 *
 * Example:
 * Input : 14
 * Factorization : 2 × 7
 *
 * 14 ÷ 2 = 7
 * 7 cannot be divided by 2, 3, or 5.
 * Remaining value = 7
 *
 * Output : false
 *
 * Time Complexity  : O(log n)
 * Space Complexity : O(1)
 */

public class UglyNumber {

    public static void main(String[] args) {

        int num = 14;

        boolean result = isUgly(num);

        System.out.println("Number : " + num);
        System.out.println("Is Ugly Number : " + result);
    }

    /**
     * Checks whether a number is an Ugly Number.
     *
     * @param num The input number.
     * @return true if the number is ugly, otherwise false.
     */
    public static boolean isUgly(int num) {

        // Ugly numbers must be positive.
        if (num <= 0) {
            return false;
        }

        // Remove all factors of 2.
        while (num % 2 == 0) {
            num /= 2;
        }

        // Remove all factors of 3.
        while (num % 3 == 0) {
            num /= 3;
        }

        // Remove all factors of 5.
        while (num % 5 == 0) {
            num /= 5;
        }

        // If only the allowed prime factors existed,
        // the remaining value will be 1.
        return num == 1;
    }
}