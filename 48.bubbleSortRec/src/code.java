import java.util.Arrays;

public class code {

    public static void main(String[] args) {

        /*
         * Example array for demonstrating Recursive Bubble Sort.
         *
         * The recursion starts from:
         * - row    = last index of the array (arr.length - 1)
         * - column = 0
         */
        int[] arr = {1, 4, 3, 5, 6, 2, 9};

        bubbleSort(arr, arr.length - 1, 0);

        System.out.println("Sorted Array (Descending): " + Arrays.toString(arr));
    }

    /**
     * Recursively performs Bubble Sort on the given array.
     *
     * This implementation sorts the array in descending order by
     * repeatedly moving the largest remaining element toward the
     * beginning of the array.
     *
     * @param arr Array to be sorted.
     * @param row Represents the current unsorted boundary.
     * @param col Represents the current index being compared.
     */
    public static void bubbleSort(int[] arr, int row, int col) {

        // Base case: the array is completely sorted.
        if (row == 0) {
            return;
        }

        // Traverse the current unsorted portion of the array.
        if (col < row) {

            // Swap adjacent elements if they are not in descending order.
            if (arr[col] < arr[col + 1]) {

                int temp = arr[col];
                arr[col] = arr[col + 1];
                arr[col + 1] = temp;
            }

            // Continue traversing the current row.
            bubbleSort(arr, row, col + 1);

        } else {

            // One complete pass is finished.
            // Reduce the unsorted boundary and start again from index 0.
            bubbleSort(arr, row - 1, 0);
        }
    }
}