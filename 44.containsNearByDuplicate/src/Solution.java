import java.util.* ;


// Fixed Nothing
public class Solution {
    public static boolean findNearByDuplicates(int[] nums , int k){

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++){
            if(map.containsKey(nums[i])){

                int prevIndex = map.get(nums[i]);

                if(i - prevIndex <= k){
                    return true ;
                }
            }
            map.put(nums[i] , i);
        }
        return false ;
    }
    public static void main(String[] args) {

        int[] nums = new int[]{1,2,3,1};
        int k = 3;
        boolean res = findNearByDuplicates(nums, k);
        System.out.println(res);
    }
}
