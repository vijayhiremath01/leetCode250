public class code {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int pivot = findPivot(nums);
        System.out.println("Pivot Element is : " + nums[pivot]);
        int target = 6 ; 
        int ans = RBS(nums , target);
        System.out.println("Target Element is at Index : " + ans);
    }

    static int RBS(int[] nums , int target){
         int pivot = findPivot(nums);
         if(pivot == -1){
            return binarySearch(nums , target , 0 , nums.length - 1 );
         } 

         // case 1 
         if(nums[pivot] == target){
            return pivot ;
         } else if(target > nums[0]){
            return binarySearch(nums , target , 0 , pivot - 1 );
         } else {
            return binarySearch(nums, target, pivot + 1 , nums.length - 1);
         }
    }

    static int binarySearch(int[] nums , int target , int start , int end){
        while(start <= end){
            int mid = start + (end - start )/2;
            if(nums[mid] == target){
                return mid ; 
            } else if(nums[mid] > target){
                end = mid - 1 ; 
            } else {
                start = mid + 1 ; 
            }
        }
        return -1 ;
    }

    static int findPivot(int[] nums){
         int start = 0 ; 
         int end = nums.length - 1 ; 

         while(start <= end){
            int mid = start + (end - start )/2;
            // 4 cases 
            if(mid < end && nums[mid] > nums[mid+1]){
                return mid ; 
            } else if(mid > start && nums[mid] < nums[mid-1]){
                return mid - 1 ; 
            } else if(nums[mid] >= nums[start]){
                start = mid + 1 ; 
            } else {
                end = mid - 1 ; 
            }
         }
         return -1 ;
    }
}
