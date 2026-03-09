// Link for Question is - https://leetcode.com/problems/single-number/description/
import java.util.*;

public class brute2 {
    public static int isSingle(int[] arrayNums){
         for(int i = 0 ; i < arrayNums.length; i++){
             int count = 0 ;
             for(int j = 0 ; j < arrayNums.length ; j++){
                 if(arrayNums[i] == arrayNums[j]){
                     count++ ;
                 }
             }
             if(count == 1){
                 return arrayNums[i];
             }
         }
         return -1 ;
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