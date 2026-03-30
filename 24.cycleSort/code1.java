import java.util.Arrays;

public class code1 {

    public static void cycleSort(int[] arr){
          int i = 0 ; 
          while(i < arr.length){
            // Correct index = value - 1 ; 
             int correctIndex = arr[i] - 1 ; 
             // Check whether the ith index and corrextindex values are same or not if not swap the index values 
             if(arr[i] != arr[correctIndex]){
                swap(arr , i , correctIndex);
             } else {
                i++; 
             }
        }
    }

    public static void swap(int[] arr , int first , int second){
         int temp = arr[first];
         arr[first] = arr[second];
         arr[second] = temp ; 
    }

    public static void main(String[] args) {
        int[] arr = {1,4,2,3,5,7,6};
        System.out.println("The Sorted array is : ");
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
