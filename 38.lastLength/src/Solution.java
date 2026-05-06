// Link for the Problem - https://leetcode.com/problems/length-of-last-word/description/

import java.util.* ;

public class Solution {

    public static int lengthOfLastWord(String s){
        char[] arr = s.toCharArray();
        int i = arr.length - 1 ;

        while(i >= 0 && arr[i] == ' '){
            i-- ;
        }

        int count = 0 ;
        while(i >= 0 && arr[i] != ' '){
            count++;
            i-- ;
        }
        return count ;
    }

    public static void main(String[] args) {
        String str = "Hello World I am Vijay ";

        System.out.println(lengthOfLastWord(str));

    }

}
