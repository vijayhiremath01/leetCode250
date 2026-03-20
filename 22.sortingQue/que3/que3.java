public class que3 {
    public static void moveZeros(int[] nums){
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = 0 ; j < nums.length - 1 ; j++){
                if(nums[j] == 0){
                    swap(nums , j , j+1);
                }
            }
        }
    }

    public static void swap(int[] nums , int first , int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

    public static void main(String[] args){
        int[] nums = {0,1,0,3,12};
        moveZeros(nums);
        for(int num : nums){
            System.out.print(num + " ");
        }
    }
}