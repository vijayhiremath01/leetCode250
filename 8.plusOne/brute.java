import java.util.* ;
public class brute {
 // creating a method for plusOne
    public static int[] plusOne(int[] array){
        String num = ""; // initialising the string

        for(int d : array){
             num += d ;
        }

        // again sting to number and then adding 1 so that n + 1
        long n = Long.parseLong(num);
        n = n + 1 ;  // plus One the number means 123 + 1 ----> 124 example just

        // Number ----> String for convert the string to array
        String s = String.valueOf(n);
        int[] result = new int[s.length()];

        for(int i = 0 ; i < s.length() ; i++){
            result[i] = s.charAt(i) - '0';
        }
        return result;
    }
    public static void main(String[] args) {


              Scanner sc = new Scanner(System.in);

              System.out.println("Enter the size of an array : ");
              int n = sc.nextInt();
              int[] array = new int[n] ;

              System.out.println("Enter the number into the array : ");
              for(int i = 0 ; i < n ; i++){
                  array[i] = sc.nextInt();
              }

              // Calling the function to plusOne
          int[] result = plusOne(array);
              System.out.println("The Array after the plusOne is : " );
              for(int i = 0 ; i < result.length ; i++){
                  System.out.print(result[i] + " ");
              }
              sc.close();
    }
}