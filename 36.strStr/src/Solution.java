import java.util.* ;

// LeetCode - Link of this problem
public class Solution {

    public static int strStr(String haystack , String needle){
        char[] arr1 = haystack.toCharArray();
        char[] arr2 = needle.toCharArray();

        for(int i = 0 ; i <= arr1.length - arr2.length ; i++){
            boolean match = true ;
            for(int j = 0 ; j < arr2.length ; j++){
                if(arr1[i+j] != arr2[j]){
                    match = false ;
                    break ;
                }
            }
            if(match){
                return i ;
            }
        }
        return -1 ;
    }

    public static void main(String[] args) {

        String haystack = "DERabc" ;
        String needle = "abc" ;
        System.out.println(strStr(haystack, needle));

    }
}
