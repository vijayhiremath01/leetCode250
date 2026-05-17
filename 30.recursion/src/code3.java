import java.util.* ;
public class code3 {


    // From n to 1 it will print
    public static void fun(int n){
        // Base Condition
        if(n == 0){
            return ;
        }


        System.out.print( n + " ");
        // calling the function itSelf
        fun(n-1);
    }

    // To print from 1 to n we have like this
    public static void funRev(int n){
        // Base Condition
        if(n == 0){
            return ;
        }

        funRev(n-1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int n = 10 ;
        fun(n);
        System.out.println(" ");
        funRev(n);

        System.out.println(" ");
        // n-- and --n Concept
        concept(n);
    }

    // n-- and --n Concept
    public static void concept(int n){
        if(n == 0){
            return ;
        }

        System.out.print(n + " ");
        // concept(n--); stack Overflow
        concept(--n);
    }
}

