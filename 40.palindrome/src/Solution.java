import java.util.* ;

// LeetCode Link - https://leetcode.com/problems/palindrome-number/submissions/1999828241/
public class Solution {

    public static boolean isPalindrome(int x){

        int temp = x ;
        int rev = 0 ;

        while(temp > 0 ){
            int digit = temp % 10 ;
            rev = rev * 10 + digit ;
            temp = temp / 10 ;
        }

        if(x == rev){
            return true ;
        }
        return false ;
    }

    public static void main(String[] args) {
        int x = 121 ;
        boolean result = isPalindrome(x);
        System.out.println(result);
    }
}
