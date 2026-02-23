import java.util.* ;

public class floor {
 
    public static int floorOfNum(int[] array , int target){     
        int start = 0 ; 
        int end = array.length - 1 ;

        while(start <= end){
            int mid = start + (end - start) / 2 ;
            if(target == array[mid]){
                return array[mid] ;
            } else if(array[mid] < target){
                start = mid + 1 ;
            } else {
                end = mid - 1 ;
            }
        }
        return end ; // return the index of the largest number smaller than or equal to target
    }

    public static void main(String[] args) {
          int[] array = {2,3,4,6,8,9,15,16,28};
          int target = 14 ;

          int ans = floorOfNum(array , target);
          System.out.println(ans);
    }
}