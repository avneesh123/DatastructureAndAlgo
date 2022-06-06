package arrays;

public class SmallestCommonNumber {

    public static void main (String [] args){
        int [] nums1 = {6, 7, 10, 25, 30, 63, 64};
        int [] nums2 = {0, 4, 5, 6, 7, 8, 50};
        int [] nums3 = {1, 6, 10, 14};

        System.out.println(commonNumber(nums1, nums2, nums3));
    }

    public static int commonNumber( int [] nums1,  int [] nums2,  int [] nums3){
        int i=0, j=0, k=0;

        while(i < nums1.length && j<nums2.length && k < nums3.length){

            if(nums1[i] == nums2[j] && nums1[i] == nums3[k]){
                return nums1[i];
            } else if(nums1[i] < nums2[j] || nums1[i] < nums3[k]){
                System.out.println("i: " +nums1[i]);
                i++;
            } else if(nums2[j] < nums1[i] || nums2[j] < nums3[k]){
                System.out.println("j: " +nums2[j]);
                j++;
            }else if(nums3[k] < nums1[i] || nums3[k] < nums2[j]){
                k++;
            }
        }
        return -1;
    }
}
