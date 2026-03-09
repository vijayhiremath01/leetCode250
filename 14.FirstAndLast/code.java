// Link for this problem : https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
public class code {
   
    public static int[] firstAndlast(int[] nums , int target){

     int[] ans = {-1 , -1};
     int start = search(nums , target , true);
     int end = search(nums , target , false );
     ans[0] = start ;
     ans[1] = end ; 

     return ans ;
    } 

    static int search(int[] nums , int target , boolean findStartIndex){
        int ans = -1 ; 
        int start = 0 ; 
        int end = nums.length - 1 ; 
        while(start <= end){
            int mid = start + (end - start) / 2 ;
            if(nums[mid] > target){
                end = mid - 1 ;
            } else if(nums[mid] < target){
                start = mid + 1 ;
            } else {
                ans = mid ; 
                if(findStartIndex){
                    end = mid - 1 ; 
                } else {
                    start = mid + 1 ;
                }
            }
        }
        return ans; 
    }


  public static void main(String[] args) {
    int[] nums = {5,7,7,8,8,10};
    int target = 8;
    int[] result = firstAndlast(nums , target);
    System.out.println("First occurrence: " + result[0]);
    System.out.println("Last occurrence: " + result[1]);
  }
}