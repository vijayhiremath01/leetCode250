import java.util.* ;

// program for factorial numbers calculation
public class code4 {
    public static void main(String[] args) {
        int n = 5 ;
        int result = fact(n);
        System.out.println(result);
    }

    public static int fact(int n){
        // Base Condition
        if(n <= 1){
            return 1 ;
        }
        // Factorial Calculation
        return n * fact(n-1);
    }
}


