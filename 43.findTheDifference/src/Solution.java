import java.util.* ;

public class Solution {
    public static char findTheDifference(String s , String t){
        char[] array1 =  s.toCharArray();
        char[] array2 = t.toCharArray();

        char ans = 0 ;
        for(char ch : array1){
            ans ^= ch ;
        }

        for(char ch : array2){
            ans ^= ch ;
        }

        return ans ;
    }
    public static void main(String[] args) {

        String s = "aab";
        String t = "aabe";
        System.out.println(findTheDifference(s,t));

    }
}
