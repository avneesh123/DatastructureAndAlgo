package arrays;

import java.util.Arrays;

public class RotatingAnArray {

    public static void main (String [] args){
       int [] nums = {1, 10, 20, 0, 59, 86, 32, 11, 9, 40};
        //if -ve rotate left else rotate right
        rotate(nums, 3);
    }

    public static int[] rotate (int[] inputArray, int rotationNumber){

        int [] outArray = new int[inputArray.length];
        boolean leftRotate = rotationNumber < 0;
        //if rotation is bigger then length take a mod
        int rotation = Math.abs(rotationNumber) % inputArray.length;
        System.out.println(rotation);
        if (leftRotate) {
            leftRotate(inputArray, outArray, rotation);
        } else {
            rightRotate(inputArray, outArray, rotation);
        }
        System.out.println(Arrays.toString(outArray));
        return outArray;
    }

    private static void leftRotate(int[] inputArray, int[] outArray, int rotation){
        int i= rotation,  j=0;
        while( i<inputArray.length){
            outArray[j] = inputArray[i];
            i++;
            j++;
        }
        i=0;
        while(i<rotation){
            outArray[j] = inputArray[i];
            i++;
            j++;
        }
    }

    private static void rightRotate(int[] inputArray, int[] outArray, int rotation){
        int i = inputArray.length - rotation, j=0;
        while( i<inputArray.length){
            outArray[j] = inputArray[i];
            i++;
            j++;
        }

        i=0;
        while(i< (inputArray.length - rotation)){
            outArray[j] = inputArray[i];
            i++;
            j++;
        }
    }

}
