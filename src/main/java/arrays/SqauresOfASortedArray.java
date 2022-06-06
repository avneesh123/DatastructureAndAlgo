package arrays;

import java.util.Arrays;
//Better way to do this
public class SqauresOfASortedArray {

    public static void main (String [] args){
        int [] nums = {-4, -1, 0, 3, 10};

        System.out.println(Arrays.toString(sortSquareArray(nums)));
    }

    public static int[] sortSquareArray(int [] unsortedArray){
        int i=0, j=0, k=0;
        int [] sorted = new int[unsortedArray.length];

        while( j < unsortedArray.length) {
            if (isNegative(unsortedArray[j])) {
                j++;
            }else break;
        }
        if(j>0)  i=j-1;

        while(i >= 0 && j < unsortedArray.length){
            if(Math.abs(unsortedArray[i]) >= unsortedArray[j]){
                sorted[k] = unsortedArray[j] * unsortedArray[j];
                j++;
            }else {
                sorted[k] = unsortedArray[i]* unsortedArray[i];
                i--;
            }
            k++;
        }

        while (j < unsortedArray.length){
            sorted[k] = unsortedArray[j]* unsortedArray[j];
            k++;
            j++;
        }

        while (i >= 0){
            sorted[k] = unsortedArray[i]* unsortedArray[i];
            k++;
            i--;
        }
      return  sorted;
    }

    public static  boolean isNegative(int number){
        return  number<0;
    }

}
