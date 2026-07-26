import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        boolean result = isPerfectSquare(num);

        System.out.println("The number is perfect square or not ? : " + result);
        sc.close();

    }

    public static boolean isPerfectSquare(int num){

        if(num == 1) return true ;

        long left = 1 ;
        long right = num ;

        while(left <= right){

            long mid = left + (right - left)/2;
            long square = mid * mid ;

            if(square == num){
                return true ;
            } else if(square < num){
                left = mid + 1 ;
            } else {
                right = mid - 1 ;
            }
        }
        return false ;
    }
}
