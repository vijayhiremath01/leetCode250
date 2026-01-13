import java.util.* ;
public class pra {

    public static int[] plusOne(int[] array){
        String num = "";

        for(int d : array){
            num += d ;
        }

        // i have to convert it from String to number again
        long n = Long.parseLong(num);
        n = n + 1 ;

        String s = String.valueOf(n);
        int[] result = new int[s.length()];

        for(int i = 0 ; i < s.length() ; i++){
            result[i] = s.charAt(i) - '0';
        }
        return result ;
    }

    public static void main(String[] args) {
        // Main Function
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] array = new int[n];

        System.out.print("Enter the elements of an array : ");
        for(int i = 0 ; i < n ; i++){
            array[i] = sc.nextInt();
        }

        int[] result = plusOne(array);
        System.out.print("The Resulted array is : ");
        for(int i = 0 ; i < result.length ; i++){
            System.out.print(" " + result[i] + " ");
        }
        sc.close();
    }
}