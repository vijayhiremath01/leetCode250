import java.util.* ;

public class code2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();

        // Initialise the array
        int[] array = new int[n];

        System.out.println("Enter the elements of the array : ");
        for(int i = 0 ; i < n ; i++){
            array[i] = sc.nextInt();
        }

        int answer = 0;
        // condition to check if the elements in array is repeated and return the single element
        for(int i = 0 ; i < n ; i++){
            answer = answer ^ array[i];
        }

            System.out.println("The Single element is : " + answer);

    }
}
