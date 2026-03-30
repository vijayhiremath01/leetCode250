
import java.util.ArrayList;
import java.util.List;

public class code1 {
  
    public static List<Integer> findDisappearedNumbers(int[] nums){
         int i = 0 ; 
         while(i < nums.length){
            int correct = nums[i] - 1 ;
            if( nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]){
                swap(nums, i, correct);
            } else {
                i++;
            }
         }
        
         List<Integer> list = new ArrayList<>();

         for(int index = 0 ; index < nums.length ; index++){
             if(nums[index] != index + 1){
                  list.add(index + 1);
             }
         }
        return list ; 
    }

    public static void swap(int[] nums , int first , int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp ; 
    }

    public static void main(String[] args) {
        int[] nums = {2,4,5,7,1,8};
        System.out.print("Disappeared Numbers : ");
        System.out.print(findDisappearedNumbers(nums));
    }
}
