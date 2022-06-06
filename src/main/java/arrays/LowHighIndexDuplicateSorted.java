package arrays;
//not able to solve
public class LowHighIndexDuplicateSorted {
    public static void main (String [] args){
        int [] nums1 = {1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6};
        //              0  1  2  4  5  6  7  8  9  10 11 12 13
        int [] nums2 = {1, 2, 3, 3, 3, 4, 5, 5, 5, 5, 5, 6, 6}; //target =5
        System.out.println(findLowIndex(nums1, 5));
        System.out.println(findHighIndex(nums1, 5));

    }


    private static int findLowIndex(int [] inputArray, int target) {
        int low =0, high = inputArray.length-1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if(inputArray[mid] < target){
                low = mid+1;
            }else {//when equal move high
                high = mid-1;
            }
        }
        if (low < inputArray.length && inputArray[low] == target) {
            return low;
        }
        return -1;
    }

    private static int findHighIndex(int [] inputArray, int target){
        int low =0, high = inputArray.length-1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if(inputArray[mid] <= target){//when equal move low
                low = mid+1;
            }else {
                high = mid-1;
            }
        }
        if (high < inputArray.length && inputArray[high] == target) {
            return high;
        }
        return -1;
    }


}
