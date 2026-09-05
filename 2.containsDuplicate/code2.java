import java.util.* ;

public class code2 {
    static int[] hashing = new int[100000];

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};

        boolean result = duplicate(nums);
        System.out.println(result);
    }

    public static boolean duplicate(int[] nums){

        for(int i = 0 ; i < nums.length ; i++){
            hashing[nums[i]] += 1 ;

            if(hashing[i] > 1){
                return true ;
            }
        }
        return false ;
    }
}
