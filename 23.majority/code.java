public class code {
    public static int majorityEle(int[] nums) {
        int candidate = 0 ;
        int count = 0 ; 

        for(int num : nums){
            if(count == 0){
                candidate = num ; 
            }

            if(candidate == num){
                count++ ; 
            } else {
                count-- ; 
            }
        }

        return candidate ; 
    }
    public static void main(String[] args) {
        int[] nums = {1,2,1 , 71};
        int answer = majorityEle(nums);
        System.out.println(answer);
    }
}
