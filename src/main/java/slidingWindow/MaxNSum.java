package slidingWindow;

import java.util.List;

public class MaxNSum {
    public static void main (String [] args){
        int [] arr   =  {1, 2, 3, 5, 3, 4, 5, -9, 8, 4, 8} ; //
        System.out.println(findMaxNSum(arr, 3));

    }
// 3, 4, 6, 1, -1, 3

    /**
     * 3 + 4 = 7
     * 3+4+6 = 13
     * 3+4+6+1 = 14
     * 3+4+6+1-1 = 13 ?????????
     * 3+4+6+1-1+3 = 16 answer
     */
// 3, 4, 6, 1, -7, 3
    /**
     * 3 + 4 = 7
     * 3+4+6 = 13
     * 3+4+6+1 = 14   answer
     * 3+4+6+1-7 = 7 ?????????
     * 3+4+6+1-1+3 = 10
     */



    public static int findContinousMaxSum(int [] arr, int n){
        int i=1, j=0;
        int maxSum = arr[0];
        int tempSum = arr[0];
        while(i < arr.length){
            tempSum = tempSum + arr[i];
            if(tempSum > maxSum){
                maxSum = tempSum;
            }else{
                j = i;
                tempSum=0;
            }
            i= i+1;
        }
        return  maxSum;
    }

    public static int findMaxNSum(int [] arr, int n){
        int i=n, j=0, k=0;
        int maxSum = 0;

        //calc sum till n numbers
        while(k<n){
            maxSum += arr[k];
            k= k+1;
        }
        System.out.println("First n number SUm == " + maxSum);
        int tempSum =maxSum;
        while( i < (arr.length)){
            tempSum = (tempSum - arr[j] )+ arr[i];
            if(tempSum > maxSum) maxSum = tempSum;
            System.out.println(" maxSum == " +  maxSum);
            i =i+1;
            j=j+1;
        }
        return maxSum;
    }


}
