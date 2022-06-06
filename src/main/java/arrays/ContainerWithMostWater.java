package arrays;

/**
 * Given an array of the heights of vertical lines, find two lines that, together with the horizontal axis, form a container that holds the most water.
 */
public class ContainerWithMostWater {

    public static void main(String[] args){
        int[] arr = {1, 1};
        System.out.println(containerWithMostWater(arr));
    }

    //pseudo code
    /**
     * start with start and end
     * maintain the max area
     * arr[start] or arr[end] whosoever is smaller maintain that index, rest ++
     */


    public static int containerWithMostWater( int [] verticalLines){
        int i=0,j=verticalLines.length-1;
        int max = Integer.MIN_VALUE;
        while(i<=j){
         int runningArea = Math.min(verticalLines[i], verticalLines[j]) * (j-i);
         max = Math.max(runningArea, max);

             if(verticalLines[i] > verticalLines[j]){
                 j--;
             }else{
                 i++;
             }
        }
        return max;
    }

}
