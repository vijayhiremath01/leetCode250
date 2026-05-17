import java.util.* ;

public class productOfDigits {
public static int prodOfDig(int num){

    if(num %10 == num){
        return num ;
    }
    return (num % 10) * prodOfDig(num/10);
}

    public static void main(String[] args) {

    int num = 1342;
    int product = prodOfDig(num);
    System.out.println(product);

    }
}
