import java.util.Arrays;

/**
 * Merge Sort Implementation in Java
 *
 * Time Complexity:
 * Best Case    : O(n log n)
 * Average Case : O(n log n)
 * Worst Case   : O(n log n)
 *
 * Space Complexity:
 * O(n) - Extra space is required for merging.
 *
 * Merge Sort follows the Divide and Conquer approach:
 * 1. Divide the array into two halves.
 * 2. Recursively sort both halves.
 * 3. Merge the two sorted halves into a single sorted array.
 */

public class MergeSort {

    public static void main(String[] args) {

        // Unsorted array
        int[] arr = {3, 9, 5, 1, 7, 6};

        // Calling Merge Sort
        int[] result = mergeSort(arr);

        // Printing the sorted array
        System.out.println("Sorted Array using Merge Sort:");
        System.out.println(Arrays.toString(result));
    }

    /**
     * Recursively divides the array until only one element remains.
     * A single-element array is already sorted.
     */
    public static int[] mergeSort(int[] arr) {

        // Base Case
        if (arr.length == 1) {
            return arr;
        }

        // Find the middle index
        int mid = arr.length / 2;

        // Divide the array into left and right halves
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        // Merge both sorted halves
        return merge(left, right);
    }

    /**
     * Merges two sorted arrays into one sorted array.
     */
    public static int[] merge(int[] first, int[] second) {

        // Final merged array
        int[] mix = new int[first.length + second.length];

        // first array pointer
        int i = 0;

        // second array pointer
        int j = 0;

        // merged array pointer
        int k = 0;

        /*
         * Compare elements from both arrays and insert
         * the smaller element into the merged array.
         */
        while (i < first.length && j < second.length) {

            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }

            k++;
        }

        /*
         * Copy remaining elements from the first array,
         * if any are left.
         */
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }

        /*
         * Copy remaining elements from the second array,
         * if any are left.
         */
        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }
}