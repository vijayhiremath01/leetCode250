import java.util.* ;

public class PrimeNo {
    public static boolean isPrime(int num){

        if(num <= 1){
            return false ;
        }

        int c = 2 ;
        while(c*c <= num){
            if(num % c == 0){
                return false ;
            }
            c++ ;
        }
        return true ;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number to check prime or notPrime : ");
        int num = sc.nextInt();

        boolean result = isPrime(num);

        // to print isPrime or not
        if(result){
            System.out.println("The number is Prime");
        } else {
            System.out.println("The number is not a Prime");
        }

    }
}

