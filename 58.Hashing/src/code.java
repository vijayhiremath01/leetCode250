
import java.util.Scanner;

public class code {

    /*
     * Frequency array used for hashing.
     *
     * Each index represents a number, and the value stored at that
     * index represents how many times the number occurs in the input.
     *
     * Example:
     * hashing[5] = 3  ->  number 5 appears 3 times.
     *
     * The array is declared as static because main() is static.
     */
    static int[] hashing = new int[10_000_000];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        /*
         * For every element in the array, increment its frequency.
         *
         * Example:
         * arr = {1, 2, 1, 3, 2, 1}
         *
         * After pre-computation:
         * hashing[1] = 3
         * hashing[2] = 2
         * hashing[3] = 1
         */
        for (int i = 0; i < n; i++) {
            hashing[arr[i]]++;
        }

        System.out.print("Enter the number of queries: ");
        int q = sc.nextInt();

        System.out.println("Enter the numbers to query:");

        /*
         * Each query can be answered in O(1) time because
         * the frequencies were already calculated during
         * pre-computation.
         */
        for (int i = 0; i < q; i++) {

            int number = sc.nextInt();

            System.out.println(
                    "The number " + number + " exists "
                            + hashing[number] + " time(s)."
            );
        }

        sc.close();
    }
}
