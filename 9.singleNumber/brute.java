import java.util.* ;

public class brute {

    public static int isSingle(int[] arrayNum){
        HashSet<Integer> seenNumbers = new HashSet<>();

        for(int num : arrayNum){
            if(!seenNumbers.contains(num)){
                // Printing the number which is Single and not repeated
                System.out.println("The number " + num + " is a singleNumber.");
                return num ;
            }
            seenNumbers.add(num);
        }

    }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         System.out.print("Enter the size of the array : ");
         int size = sc.nextInt();

         int[] arrayNum = new int[size];

         System.out.println('Enter the Elements of the array : ');
         for(int i = 0 ; i < size ; i++){
             arrayNum[i] = sc.nextInt();
         }

         int result = isSingle(arrayNum);
         System.out.print(result);
         sc.close();
    }

}