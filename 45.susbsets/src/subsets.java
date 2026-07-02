import java.util.ArrayList;
import java.util.List;

public class subsets {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};

        // Stores the subset currently being constructed.
        ArrayList<Integer> current = new ArrayList<>();

        // Stores all generated subsets.
        ArrayList<List<Integer>> answer = new ArrayList<>();

        // Start recursive backtracking from index 0.
        solve(nums, 0, current, answer);

        System.out.println("The subsets of the given array are: " + answer);
    }

    /**
     * Generates every possible subset using recursive backtracking.
     *
     * Idea:
     * For every element we have exactly two choices:
     * 1. Include the current element.
     * 2. Exclude the current element.
     *
     * The recursion explores both choices until every element
     * has been processed.
     *
     * @param nums    Input array
     * @param index   Current position being processed
     * @param current Current subset being built
     * @param answer  Stores all generated subsets
     */
    public static void solve(int[] nums,
                             int index,
                             ArrayList<Integer> current,
                             ArrayList<List<Integer>> answer) {

        /*
         * Base Case
         * Once every element has been processed,
         * the current subset is complete.
         * A new copy of the current subset is stored because
         * 'current' will continue to change during backtracking.
         */
        if (index == nums.length) {
            answer.add(new ArrayList<>(current));
            return;
        }

        /*
         * Choice 1 : Include Element
         * Add the current element to the subset
         * and continue exploring.
         */
        current.add(nums[index]);
        solve(nums, index + 1, current, answer);

        /*
         * Backtracking
         * Undo the previous decision so the next
         * recursive branch starts from the original state.
         */
        current.removeLast();

        /*
         * Choice 2 : Exclude Element
         * Skip the current element and continue exploring.
         */
        solve(nums, index + 1, current, answer);
    }
}