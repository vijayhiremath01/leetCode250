import java.util.Scanner;

public class que {
    public void printNumber(Scanner sc){
        int number = sc.nextInt();
        System.out.println(number);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print the number : ");
        que obj = new que();
        obj.printNumber(sc);
    }
}
