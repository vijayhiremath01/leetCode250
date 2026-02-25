// Problem Link : https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
public class brute {

    public static void peakElement(int[] nums){
        int n = nums.length ; 
        int start = 0 ; 
        int end = n - 1 ; 
        while(start < end){
            int mid = start + (end - start )/2 ; 
            if(nums[mid] > nums[mid+1]){
                end = mid ; 
            } else {
                start = mid + 1 ; 
            }
        }
        System.out.println("Peak Element is : " + nums[start]);
    }
     public static void main(String[] args) {
        int[] nums = {0,1,5,6,8,3,2,1};
        peakElement(nums);
     }
}
