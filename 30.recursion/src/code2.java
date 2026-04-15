public class code2 {

    // Sorting array before Recursive Binary Search
    public static int[] iSort(int[] nums){
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = i + 1 ; j < nums.length ; j++ ){
                if(nums[j] < nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp ;
                }
            }
        }
        return nums;
    }

    // Recursive BinarySearch
    public static int binarySearch(int[] nums , int target , int start , int end){
        // base condition
      if(start > end) {
          return -1;
      }

      // Binary Search using recursion
        int mid = start + (end - start)/2;

      if(nums[mid] == target){
          return mid ;
      }
      if(target < nums[mid]){
           return binarySearch(nums , target , start , mid -1 );
      }
      return binarySearch(nums , target , mid + 1 , end);

    }

    // Binary Search work only for sorted arrays
    public static void main(String[] args) {
         int[] nums = {1,2,5,3,6,4,8,7};
         int target = 6 ;
         int[] sortedNums = iSort(nums);
         int ans = binarySearch(sortedNums , target , 0 , nums.length);
         System.out.println("The Target element is found at index : " + ans);
    }
}
