import java.util.*;

public class linearSearch {
    // return true if element found in array
    public static boolean search(int[] array, int target) {
        // check if length of array is zero
        if (array.length == 0) {
            return false;
        }
        // check with loop
        for (int element : array) {
            if (element == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = { 12, 34, 7, 89, 67, 45 };
        int target;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a target : ");
        target = sc.nextInt();
        boolean ans = search(array, target);
        System.out.println(ans);
        sc.close();
    }
}