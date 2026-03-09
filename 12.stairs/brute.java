
// Link for Question is - https://leetcode.com/problems/climbing-stairs/description/
import java.util.* ;

public class brute {

    public static int climbStairs(int n){
        // becuas the number itself is the stair
        int count = 1 ;
        // i have to convert the n into 1 to n array element
       // for that i am using array list
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            list.add(i);
        }
        // now iterating through that arraylIst and checking the ways
            for(int num : list){
                for(int num1 : list){
                    if(num + num1 == n ){
                        count++ ;
                    }
                }
            }
            return count ;
    }

    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter the number : " );
       int n = sc.nextInt();

       // calling climbStairs function
        int numberOfWays = climbStairs(n);
        System.out.print("The number of ways : " + numberOfWays);
        System.out.print(" ");
    sc.close();
    }
}