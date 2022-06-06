package arrays;

public class RotatedBinarySearch {

    public static void main (String [] args){
        int [] nums = {4, 5, 6, 1, 2, 3};
       System.out.println(find(nums, 3));
    }

    public static int find (int[] inputArray, int target){

        int low=0, high = inputArray.length-1;
        while (low <= high){
            int mid = low + (high-low)/2;

           if(inputArray[mid] == target ){
               return mid;
           }else if(inputArray[high] == target ) {
               return high;
           }else if(inputArray[high] < target ){
                high = mid-1;
           }else if(inputArray[mid] < target){
               low = mid+1;
           }else if(inputArray[mid] > target){
               high = mid-1;
           }

        }
        return -1;
    }

}
