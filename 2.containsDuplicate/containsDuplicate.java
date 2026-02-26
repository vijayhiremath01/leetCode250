//Link for Question is - https://leetcode.com/problems/contains-duplicate/description/
import java.util.*;

public class containsDuplicate {
    public boolean ContainsDuplicate(int[] nums){
        HashSet<Integer> seenNumbers = new HashSet<>();

        for(int num : nums){
            if(seenNumbers.contains(num)){
                // How much time it is repeated 
                System.out.println("The number " + num + " is repeated.");
                return true;
            }
            seenNumbers.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        containsDuplicate obj = new containsDuplicate();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();

        int[] nums = new int[size];   // FIXED

        System.out.println("Enter the elements of the array : ");
        for(int i = 0; i < size; i++){
            nums[i] = sc.nextInt();
        }

        boolean result = obj.ContainsDuplicate(nums);
        System.out.println(result);
        sc.close();
    }
}
