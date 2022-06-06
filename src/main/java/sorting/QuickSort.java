package sorting;


import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    //100 million it will stackoverflow bcz of recursion
    //10 million in 5 sec
    public static void main (String [] args){
        Random rand = new Random();
        int[] numbers = new int[10];

        for(int i=0; i< numbers.length; i++){
            numbers[i] = rand.nextInt(100);
        }
        System.out.println("Before ==== " + Arrays.toString(numbers));
        quicksort(numbers, 0, numbers.length-1);
        System.out.println("After ==== " + Arrays.toString(numbers));
    }

    private static void quicksort(int[] array, int lowIndex, int highIndex){
        if(lowIndex >= highIndex) {
            return;
        }
        //this will give a pivot between low and high index
        int pivotIndex = new Random().nextInt(highIndex-lowIndex) + lowIndex;
        int pivot = array[pivotIndex];
        swap(array, pivotIndex, highIndex);

        int leftPointer = partitioning(array,  lowIndex,  highIndex,  pivot);
        quicksort(array, lowIndex, leftPointer-1);
        quicksort(array, leftPointer+1, highIndex);
    }

    private static int partitioning(int[] array, int lowIndex, int highIndex, int pivot){
        int leftPointer = lowIndex;
        int rightPointer = highIndex-1;

        while (leftPointer < rightPointer){
            while(array[leftPointer] <= pivot && leftPointer < rightPointer ){
                leftPointer++;
            }
            while(array[rightPointer] >= pivot && leftPointer < rightPointer ){
                rightPointer--;
            }
            swap(array, leftPointer, rightPointer);
        }
        swap(array, leftPointer, highIndex);
        return leftPointer;
    }

    private static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

   /* public static int partition(int [] a, int low, int high){
        int pivot = a[l];
        int i = l; j h;

        do {

        }while (){

        }
    }*/

}
