import java.util.* ;

// Question to find all prime numbers below the 40
public class primeNo40 {
    public static boolean isPrime(int num){

        if(num <= 1){
            return false ;
        }

        int c = 2 ;
        while(c*c <= num){
            if(num % c == 0){
                return false ;
            }
            c++ ;
        }
        return true ;
    }

    public static void main(String[] args) {
         int num = 40 ;

         for(int i = 0 ; i < num ; i++){
             boolean result = isPrime(i);
             if(result){
                 System.out.println(i);
             }
         }
    }
}
