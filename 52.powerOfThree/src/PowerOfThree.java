/**
 * Problem: Power of Three & Power of Four
 *
 * A number is said to be a power of a base if it can be
 * repeatedly divided by that base until the remaining value
 * becomes exactly 1.
 *
 * Examples:
 *
 * Power of Three:
 * 27  -> 27 / 3 = 9
 *      ->  9 / 3 = 3
 *      ->  3 / 3 = 1  ✅
 *
 * Power of Four:
 * 64  -> 64 / 4 = 16
 *      -> 16 / 4 = 4
 *      ->  4 / 4 = 1  ✅
 *
 * If, after removing all factors of the base,
 * the remaining number is 1, then the number is a power
 * of that base.
 *
 * Time Complexity  : O(log₃ n) for Power of Three
 *                    O(log₄ n) for Power of Four
 * Space Complexity : O(1)
 */

public class PowerOfThree {

    public static void main(String[] args) {

        int powerOfThreeNumber = 729;
        int powerOfFourNumber = 16;

        System.out.println("Number : " + powerOfThreeNumber);
        System.out.println("Is Power of Three : " + isPowerOfThree(powerOfThreeNumber));

        System.out.println();

        System.out.println("Number : " + powerOfFourNumber);
        System.out.println("Is Power of Four : " + isPowerOfFour(powerOfFourNumber));
    }

    /**
     * Checks whether the given number is a power of 3.
     *
     * @param num Input number
     * @return true if the number is a power of 3, otherwise false
     */
    public static boolean isPowerOfThree(int num) {

        // Powers must be positive.
        if (num <= 0) {
            return false;
        }

        // Remove every factor of 3.
        while (num % 3 == 0) {
            num /= 3;
        }

        // If only factors of 3 existed, the remaining value is 1.
        return num == 1;
    }

    /**
     * Checks whether the given number is a power of 4.
     *
     * @param num Input number
     * @return true if the number is a power of 4, otherwise false
     */
    public static boolean isPowerOfFour(int num) {

        // Powers must be positive.
        if (num <= 0) {
            return false;
        }

        // Remove every factor of 4.
        while (num % 4 == 0) {
            num /= 4;
        }

        // If only factors of 4 existed, the remaining value is 1.
        return num == 1;
    }
}