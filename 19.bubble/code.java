// if not swapped we have to break the program 
// because the array is sorted
public class code {

    public static void bubbleSort(int[] nums){
        boolean swapped = false ;
        for(int i = 0 ; i < nums.length  ; i++){
            // From 1 to n - i 
            // if 0 then n - i - 1 
            for(int j = 1 ; j < nums.length - i  ; j++){
                // if j is smaller than j - 1 then swap
                if(nums[j] < nums[j - 1]){
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j-1] = temp ;
                    swapped = true ;
                }
            }
            // if not swapped then break the program
            if(!swapped){
                System.out.println("Array is sorted Already");
                break ;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {-2,-7,-32,2,1,9};
        // Call the bubbleSort method
        bubbleSort(nums);
        for(int i = 0 ; i < nums.length ; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
