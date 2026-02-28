// Link for Question is - https://leetcode.com/problems/valid-anagram/description/

import java.util.*;

// Given two strings s and t
// Return true if t is an anagram of s, else false
// Anagram means same characters with same frequency, order does not matter

public class bruteForce {

    public boolean isAnagram(String s, String t) {

        // Step 1: Check length
        if (s.length() != t.length()) {
            return false;
        }

        // Step 2: Convert strings to char arrays
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        // Step 3: Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Step 4: Compare sorted arrays
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {

        String s = "vijay";
        String t = "javiy";

        // Creating object because isAnagram is non-static
        bruteForce obj = new bruteForce();

        // Calling method and printing result
        System.out.println(obj.isAnagram(s, t));
    }
}
// Sorting is not for large datas so its not an optimal solution O(nlogn)