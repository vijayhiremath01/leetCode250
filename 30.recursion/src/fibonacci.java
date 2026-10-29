public class fibonacci {

    public static int fib(int n){
        if(n == 0){
            return 0 ;
        } else if(n == 1){
            return 1 ;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 30 ;
        int result = fib(n);
        System.out.println(result);
    }
}
