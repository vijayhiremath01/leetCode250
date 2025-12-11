import java.util.*;

public class containsDuplicate {
    public boolean ContainsDuplicate(int[] nums){
        HashSet<Integer> seenNumbers = new HashSet<>();
        // We are iterating through each element in an array 
        for(int num : nums){
            // If the number is already in the set, we have a duplicate
            if(seenNumbers.contains(num)){
                return true;
            }
            // Add the number to hashSet
            seenNumbers.add(num);
        }
        // If we dont find any duplicates, return false
        return false;
    }

    public static void main(String[] args) {
        containsDuplicate obj = new containsDuplicate();
        int[] nums = {1 , 4, 5, 6,7 ,8 };
        boolean result = obj.ContainsDuplicate(nums);
        System.out.println(result);
    }
}
