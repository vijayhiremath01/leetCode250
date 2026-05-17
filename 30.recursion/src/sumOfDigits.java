public class sumOfDigits {
    public static int sumOfDigit(int num) {

        int sum = 0;

        // Base Condition
        if (num == 0) {
            return sum;
        }

        int rem = num % 10;
        sum += rem;
        return sum + sumOfDigit(num / 10);

    }

    public static void main(String[] args) {
        int num = 4365;
        int result = sumOfDigit(num);
        System.out.println(result);
    }
}
