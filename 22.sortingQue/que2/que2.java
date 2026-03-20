// 2️⃣ Find Second Largest Element
//Find the second largest number in an array.
public class que2 {

    // First sort the Array 
    public static int[] sortArray(int[] nums){
        for(int i = 0 ; i < nums.length - 1 ; i++){
            for(int j = i + 1 ; j > 0 ; j--){
                if(nums[j] < nums[j-1]){
                    swap(nums , j , j-1);
                } else {
                    break ; 
                }
            }
        }
        return nums ; 
    }

 // Method to swap the element 
    public static void swap(int[] nums , int first , int second){
        int temp = nums[first] ;
        nums[first] = nums[second];
        nums[second] = temp ; 
    }

    // Method to return second Greatest Element 
    public static int findSecondLargest(int[] nums , int n ) {
          // Returning the second Leargest element which is present in the nums.length - 2
          return nums[n - 2] ; 
    }

    public static void main(String[] args) {
        int[] nums = {2,3,4,1,5};
        int n = nums.length ; 
        sortArray(nums);
        int answer = findSecondLargest(nums , n);
        System.out.print("The second largest element is : " + answer );
    }
}
