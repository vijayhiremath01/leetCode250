import java.util.ArrayList;

/**
 * Demonstrates how to find all occurrences of a target element
 * in an array using recursion.
 *
 * Instead of returning only the first matching index,
 * this program returns a list containing every matching index.
 */
public class Find {

    public static void main(String[] args) {

        int[] array = {1, 3, 5, 5, 7, 83};

        // Find all indexes where the target (5) exists.
        ArrayList<Integer> answer = findAllIndex2(array, 5, 0);

        System.out.println("Indexes of target element: " + answer);
    }


    /*
     * --------------------------------------------------------------------
     * APPROACH 1 (Commented)
     * --------------------------------------------------------------------
     *
     * Here, the same ArrayList is passed through every recursive call.
     * Whenever a matching element is found, its index is directly added
     * to that shared list.
     *
     * Since every recursive call works on the same object, no merging
     * of results is required while returning.
     */

    /*
    public static ArrayList<Integer> findAllIndex(int[] arr,
                                                  int target,
                                                  int index,
                                                  ArrayList<Integer> list) {

        // Base Case: Entire array has been traversed.
        if (index == arr.length) {
            return list;
        }

        // Store the current index if target is found.
        if (arr[index] == target) {
            list.add(index);
        }

        // Continue searching in the remaining array.
        return findAllIndex(arr, target, index + 1, list);
    }
    */


    /**
     * Finds all indexes of the target element using recursion
     * without passing an ArrayList as an argument.
     *
     * <p>How it works:</p>
     * <ul>
     *     <li>Every recursive call creates its own local ArrayList.</li>
     *     <li>If the current element matches the target,
     *         its index is added to that local list.</li>
     *     <li>The recursive call searches the remaining array
     *         and returns another list.</li>
     *     <li>The current list merges the returned list using addAll().</li>
     *     <li>As recursion unwinds, all partial results combine
     *         into one final list.</li>
     * </ul>
     *
     * This approach demonstrates how recursion can build and combine
     * results without relying on shared mutable state.
     *
     * @param arr    Input array
     * @param target Value to search for
     * @param index  Current position being processed
     * @return List containing all indexes where the target exists
     */
    public static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index) {

        // Every recursive call owns its own list.
        ArrayList<Integer> list = new ArrayList<>();

        // Base Case:
        if (index == arr.length) {
            return list;
        }

        // If the current element matches the target,
        // store its index in this call's local list.
        if (arr[index] == target) {
            list.add(index);
        }

        // Recursively search the remaining portion of the array.
        ArrayList<Integer> remainingIndexes =
                findAllIndex2(arr, target, index + 1);

        // Merge the indexes found in deeper recursive calls.
        list.addAll(remainingIndexes);

        // Return the complete result for this recursive level.
        return list;
    }
}