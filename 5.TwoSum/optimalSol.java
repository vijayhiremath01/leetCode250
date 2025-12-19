import java.util.*;

public class optimalSol {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7,8,9};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the targeted sum: ");
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
