import java.util.* ; 

/// This wont work actually this is wrong code 
public class code2 {

    public static int isMultiple(int[] nums){
        HashSet<Integer> seenNumbers = new HashSet<>();

        for(int num : nums){
            if(seenNumbers.contains(num)){
                return num ; 
            }
            seenNumbers.add(num);
        }
        return 0 ; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();

        int[] arrayNum = new int[size];

        System.out.println("Enter the Elements of the array : ");
        for(int i = 0 ; i < size ; i++){
            arrayNum[i] = sc.nextInt();
        }

        int result = isMultiple(arrayNum);
        System.out.print("The Majority Element is " + result);
        sc.close();
   }
}
