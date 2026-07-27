
public class Solution {

    public static void main(String[] args) {

        int num = 342 ;
        int result = reverseArray(num);
        System.out.print("The reversed number is : " + result);

    }

    public static int reverseArray(int num){

        int rem = 0 ;
        int reversed = 0 ;

        while(num != 0){
            rem = num % 10 ;
            num /= 10 ;
            if (reversed > Integer.MAX_VALUE / 10 ||
                    (reversed == Integer.MAX_VALUE / 10 && rem > 7)) {
                return 0;
            }

            if (reversed < Integer.MIN_VALUE / 10 ||
                    (reversed == Integer.MIN_VALUE / 10 && rem < -8)) {
                return 0;
            }
            reversed = reversed * 10 + rem ;
        }
        return reversed ;
    }
}
