// 1️⃣ Check if Array is Sorted
//Write a function that checks whether an array is sorted in ascending order.
public class que1 {

    public static boolean isSorted(int[] nums){
          for(int i = 0 ; i < nums.length - 1 ; i++){
             if(nums[i] > nums[i+1]){
                 return false ; 
             }
          }
          return true ;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(isSorted(nums));
    }
}
