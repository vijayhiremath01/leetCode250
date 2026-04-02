public class code1 {

    public static int findDuplicates(int[] nums){
       int i = 0 ;
       while(i < nums.length){

           if(nums[i] != i + 1){
               int correct = nums[i] - 1 ;
               if(nums[i] != nums[correct]){
                   swap(nums , i , correct);
               } else {
                   return nums[i];
               }
           }else {
               i++ ;
           }
       }
       return -1 ;
    }

    // Swapping Function
    public static void swap(int[] nums , int first , int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

    public static void main(String[] args) {
          int[] nums = {3,1,3,4,2};
          System.out.println(findDuplicates(nums));
    }
}