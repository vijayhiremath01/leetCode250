// Link for Question is - https://leetcode.com/problems/missing-number/description/
import java.util.*;

public class brute {

public static int sumMissNum(int[] nums){
    int n = nums.length ;
    int sum = (n*(n+1))/2;
    int sum2 = 0 ; 

    for(int num : nums){
        sum2 += num ; 
    }

    int missingNum = sum - sum2 ; 
    return missingNum ; 
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array : ");
        for(int i = 0 ; i < n ; i++){
            nums[i] = sc.nextInt();
        }
        int result = sumMissNum(nums);
        System.out.println("The missing number is : " + result);
        sc.close();
    }
}