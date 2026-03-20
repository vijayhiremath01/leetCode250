public class code {

    public static void iSort(int[] nums){
        for(int i = 0 ; i < nums.length - 1 ; i++){
            for(int j = i + 1 ; j > 0 ; j--){
                if(nums[j] < nums[j-1]){
                    swap(nums , j , j-1);
                } 
                else{
                    break;
                }
            }
        }
    }

    public static void swap(int[] nums , int first , int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        iSort(nums);
        for(int i = 0 ; i < nums.length ; i++){
            System.out.print(nums[i] + " ");
        }
    }
}