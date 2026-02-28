// Link for Question is - https://leetcode.com/problems/valid-anagram/description/
    
import java.util.*;

//    Optimal approach is counting the frequency
//    * count how many times each character appears
//    if all freq is correct then ----> Anagram
//English letters = 26
//    Map each character to an index:
//            'a' → 0
//            'b' → 1
//            ...
//            'z' → 25

//    a → 3
//    n → 1
//    g → 1
//    r → 1
//    m → 1
//    Step 2: Subtract t
//    If final array contains only zeros → anagram

public class optimalSol {
    public static boolean isAnagram(String s , String t){
        // Step-1 : check length
        if(s.length() != t.length()){
            return false ;
        }

        // Step-2 : Freq array for 26 characters
        int[] freq = new int[26];


        // step-3 :
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        // Step 4: Decrease count using t
        for (int i = 0; i < t.length(); i++) {
            freq[t.charAt(i) - 'a']--;
        }

        // Step-5 :
        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }
     return true ;
    }

    public static void main(String[] args) {
          String s = "vijay";
          String t = "javiy";

          System.out.println(isAnagram(s , t));
    }
}
