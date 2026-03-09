
// Link for Question is - https://leetcode.com/problems/plus-one/description/
import java.util.*;

public class opti {

    public static int[] plusOne(int[] array) {

        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] < 9) {
                array[i]++;
                return array;
            }
            array[i] = 0;
        }

        int[] result = new int[array.length + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();

        int[] array = new int[n];

        System.out.print("Enter the numbers into array : ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int[] result = plusOne(array);

        System.out.println("The array after the plusOne is : ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}
