
// Link for Question is - https://leetcode.com/problems/single-number/description/
import java.util.* ;

public class optimal {
     public static int isSingle(int[] arrayNums){
           int result = 0 ;

           for(int num : arrayNums){
               result ^= num;
           }

           return result ;
     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array : ");
        int n = sc.nextInt();

        int[] arrayNums = new int[n];
        System.out.print("Enter the elements of an array : ");
        for(int i = 0 ; i < n ; i++){
            arrayNums[i] = sc.nextInt();
        }

        int result = isSingle(arrayNums);
        System.out.println(result);
    }
}