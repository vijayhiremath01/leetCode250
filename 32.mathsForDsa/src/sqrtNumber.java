import java.util.* ;

public class sqrtNumber {

    // O(log(n)) is the time complexity !
    public static double sqrt(int n , int p){
         int start = 0 ;
         int end = n ;

         double root = 0.0 ;

         while(start <= end){
             int mid = start + (end - start)/2 ;

             if(mid*mid == n){
                 return mid ;
             } else if(mid*mid > n){
                 end  = mid - 1 ;
             } else {
                 start = mid + 1 ;
             }
         }

         double incm = 0.1 ;
         for(int i = 0 ; i < p ; i++){
             while(root*root <= n){
                  root += incm ;
             }

             root-= incm ;
             incm /= 10 ;
         }

         return root;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int p = s.nextInt();
        double result = sqrt(n,p);
        System.out.println(result);
    }
}
