import java.util.* ;

public class reverseNumber {

    static int sum = 0 ;
    public static void reverse1(int num){
          if(num == 0){
              return ;
          }

          int rem = num % 10 ;
          sum = sum * 10 + rem ;
          reverse1(num /10);

    }

    public static void main(String[] args) {
         int num = 1234;
         reverse1(num);
         System.out.println(sum);
    }
}
