import java.util.* ;

public class RemoveElement {

    public static int removeElement(int[] nums , int val){
        if(nums.length == 0){return 0;}

        int k = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
   int[] nums = {3,2,2,3,5,6};

   int result = removeElement(nums,3);
   System.out.println(result);
    }

}
