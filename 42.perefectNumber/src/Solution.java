public class Solution {

    public static boolean isPerfectNumber(int num){

        int sum = 0 ;

        for(int i = 1 ; i < num  ; i++){
            if(num % i == 0){
                System.out.print(i + " ");
                sum += i ;
            }
        }
        System.out.println(sum);
        return sum == num ;
    }

    public static void main(String[] args) {

        int num = 28 ;
        System.out.println(isPerfectNumber(num));

    }
}
