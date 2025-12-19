import java.util.*;

public class bruteForce {

    // Method for Two Sum (Brute Force)
    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{}; // no solution case
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int[] result = twoSum(nums, target);

        if (result.length == 0) {
            System.out.println("No solution found");
        } else {
            System.out.println("Indices: " + result[0] + " " + result[1]);
        }

        sc.close();
    }
}

//🔹 Why This Is Not Optimal?
//For n = 10⁵, you’ll do ~10¹⁰ comparisons
//Very slow ❌