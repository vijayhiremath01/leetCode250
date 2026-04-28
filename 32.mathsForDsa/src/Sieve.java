import java.util.* ;

// checking all the prime numbers below n
public class Sieve {

    public static void isPrime(int n , boolean[] nums){

        for(int i = 2 ; i * i <= n ; i++){
            if(!nums[i]){
                for(int j = i * 2 ; j <= n ; j += i ){
                    nums[j] = true ;
                }
            }
        }
        for(int i = 2 ; i <= n ; i++){
            if(!nums[i]){
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
         int n = 40 ;
         boolean[] nums = new boolean[n+1];
         isPrime(n , nums);
    }
}
