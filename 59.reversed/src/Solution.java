import java.util.*;

public class Solution {

    public static List<Integer> reverseArray(List<Integer> a) {
        List<Integer> reversed = new ArrayList<>();
        for (int i = a.size() - 1; i >= 0; i--) {
            reversed.add(a.get(i));
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arrCount = sc.nextInt();

        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < arrCount; i++) {
            arr.add(sc.nextInt());
        }

        List<Integer> res = reverseArray(arr);

        for (int i = 0; i < res.size(); i++) {
            System.out.print(res.get(i));
            if (i != res.size() - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();

        sc.close();
    }
}