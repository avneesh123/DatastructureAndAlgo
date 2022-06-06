package arrays;

import java.util.Arrays;
//not able to solve
public class MovingAllZerosToFront {

    public static void main (String [] args) {
        int[] nums = {1, 10, 20, 0, 59, 63, 0, 88, 0};
        moveZeroToFront(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroToFront(int[] nums){
        int read = nums.length-1, write=nums.length-1;
        while(read >= 0){
            if(nums[read]!=0){
                nums[write] = nums[read];
                write --;
            }
            read --;
        }
        while (write >=0){
            nums[write] = 0;
            write--;
        }


    }

}
