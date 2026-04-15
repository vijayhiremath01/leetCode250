public class code1 {

    public static int fib(int n ){
        // base condition
        if(n < 2){
            return n ;
        }
        // recursion used
        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
           int ans = fib(6);
           System.out.println("The Answer is : " + ans);
    }
}