import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {

        char[] s = {'h' , 'e' , 'l' , 'l'};
        char[] result = reverseString(s);
        System.out.print("The reversed array is : " + Arrays.toString(result));

    }

    public static char[] reverseString(char[] s){
        int left = 0 ;
        int right = s.length - 1 ;

        while(left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp ;
            left++ ;
            right-- ;
        }

        return s;
    }
}
