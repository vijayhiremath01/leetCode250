public class code {

     public static class MountainArray {
        int[] arr ; 
        public MountainArray(int[] arr){
            this.arr = arr ; 
        }
        public int get(int index){
            return arr[index];
        } public int length(){
            return arr.length ; 
        }
     }

       public static int binarySearch(int target , int start , int end , MountainArray mountainArr , boolean asc){
            while(start <= end){
                int mid = start + (end - start)/2 ;
                int midVal = mountainArr.get(mid);

                if(midVal == target) return mid ;

                if(asc){
                    if(midVal > target){
                        end = mid - 1 ;
                    } else {
                        start = mid + 1 ; 
                    }
                } else {
                    if(midVal > target){
                        start = mid + 1 ;
                    } else {
                        end = mid - 1 ; 
                    }
                }
            }
            return -1 ;
       }
// Finding the peak element in the mountain array
       public static int findPeak(int target , MountainArray mountainArr){
           int start = 0 ; 
           int end = mountainArr.length() - 1 ;

           while(start < end){
                int mid = start + (end - start )/2 ;
                int midVal = mountainArr.get(mid);
                if(mountainArr.get(mid) > mountainArr.get(mid+1)){
                    end = mid ;
                } else {
                    start = mid + 1 ;
                }
           } 

           int peak = start ; 

           // Find in left 
           int left = binarySearch(target, 0, peak, mountainArr, true);
           if(left != -1) return left ; 

          // Finding in Right 
          return binarySearch(target , peak + 1 , mountainArr.length() - 1 , mountainArr , false);
       }
       public static void main(String[] args) {
          MountainArray mountainArr = new MountainArray(new int[]{1,2,3,4,5,3,1});
           int target = 4 ;     
           int peakIndex = findPeak(target , mountainArr);
           System.out.println("Peak Index is : " + peakIndex);
       }    
}
