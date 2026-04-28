import java.util.* ;

public class code1 {
    public static void main(String[] args) {

        // to check whether the given number is even or add
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int number = sc.nextInt();

        // Condition to check the number even or odd
        // when we AND (&) any number with 1 then if it returns 1 then it is ODD number otherwise its even
        if((number & 1) == 1){
            System.out.println("The Number is ODD!");
        } else {
            System.out.println("The number is EVEN!");
        }

        sc.close();

    }
}
