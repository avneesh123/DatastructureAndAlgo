package binarySearch;

public class ImplementBinarySearch {

    public static void main (String [] args){
    int [] nums = {1, 3,9, 10, 12};
    //  System.out.println( binarySearch(nums, 14));
      System.out.println( binarySearchRecursive(nums, 0, nums.length-1, 13));
    }

    public static int binarySearch(int[] nums, int target){
        int mid, high=nums.length-1, low =0;
        while(low <= high){
            mid = low + (high-low)/2;
            if(nums[mid] == target) return mid;
            if(nums[mid] > target) high = mid -1;
            if(nums[mid] < target) low = mid +1;
        }
        return -1;
    }

    public static int binarySearchRecursive(int[] nums, int low, int high, int target){
        int mid = low + (high-low)/2;
        if(nums[mid] == target) return mid;
        if(low >= high) return -1;
        if(nums[mid] > target) high = mid -1;
        if(nums[mid] < target) low = mid +1;
        return binarySearchRecursive(nums, low, high, target);
    }
}
