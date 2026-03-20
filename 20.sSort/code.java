public class code {

    public static void selectionSort(int[] nums ) {
        System.out.println("Selection sort done !");
         for(int i = 0 ; i < nums.length ; i++){
            int last = nums.length - i - 1 ;
            int maxIndex = getMaxindex(nums , 0 , last);
            swap(nums , maxIndex , last);
         }
    }


    // to swap maxIndex with last index 
    public static void swap(int[] nums , int first , int second){
           int temp = nums[first];
           nums[first] = nums[second];
           nums[second] = temp ;
    }

    // To get the maxIndex in the range
    public static int getMaxindex(int[] nums , int start , int last ){
        int max = start ; 
        for(int i = start ; i <= last ; i++){
            if(nums[max] < nums[i]){
                max = i ;
            }
        }
        return max ;
    }

    public static void main(String[] args) {
        int[] nums = {-2,-7,-32,2,1,9};
        selectionSort(nums);
        for(int i = 0 ; i < nums.length ; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
