package heap;

import java.util.Arrays;
import java.util.List;

public class BinaryHeap {
    private int capacity = 10;
    private int size = 0;
    int [] items = new int[capacity];

    public static void main(String [] args){
        List <Integer> heap = Arrays.asList(10, 20, 30, 25, 5, 40, 35, 54, 52, 4 );
        BinaryHeap binaryHeap = new BinaryHeap();
        for(int number : heap) {
            binaryHeap.add(number);
        }
        System.out.println(Arrays.toString(binaryHeap.items));
        binaryHeap.heapSort();
        System.out.println(Arrays.toString(binaryHeap.items));
    }

    private int getLeftChildIndex(int parentIndex){return 2*parentIndex+1;}
    private int getRightChildIndex(int parentIndex){return 2*parentIndex+2;}
    private int getParentIndex(int childIndex){return (childIndex-1)/2;}

    private boolean hasLeftChild(int parentIndex){return getLeftChildIndex(parentIndex)<size;}
    private boolean hasRightChild(int parentIndex){return getRightChildIndex(parentIndex)<size;}
    private boolean hasParent(int childIndex){return getParentIndex(childIndex)>=0;}

    private int leftChild(int parentIndex){return items[getLeftChildIndex(parentIndex)];}
    private int rightChild(int parentIndex){return items[getRightChildIndex(parentIndex)];}
    private int parent(int childIndex){return items[getParentIndex(childIndex)];}

   private void swap(int indexOne, int indexTwo){
        int temp = items[indexOne];
       items[indexOne] = items[indexTwo];
       items[indexTwo] = temp;
   }

   private void ensureExtraCapacity(){
        if(size == capacity){
            items = Arrays.copyOf(items, capacity*2);
            capacity *= 2;
        }
   }

   //returns root
   public int peek(){
        if(size == 0 ) throw new IllegalStateException("Array Size is zero");
        return items[0];
   }

    public void heapSort(){
        for(int i=items.length-1;  i>=0; i--){
            int deletedElement = poll();
            items[i] = deletedElement;
        }
    }

   /* *//**
     * Way of creating a heap, faster than other methods
     * out insert won't bubble down but just like delete it will bubble up
     *
     *//*
    public void heapify(){
        for(int i=items.length-1;  i>=0; i--){
            //check if it has left child
            if(hasLeftChild(i)){
                int largerChildIndex = getLeftChildIndex(i);
                if(hasRightChild(i) && rightChild(i) > leftChild(i)){
                    largerChildIndex = getRightChildIndex(i);
                }

                if(items[index] > items[largerChildIndex]){
                    break;
                }else{
                    swap(index, largerChildIndex);
                }
                index = largerChildIndex;



            }
        }
    }*/

    /**
     *For delete operation
     * Delete ROOT element
     * Get last element, put it in root
     * dec size of array
     * HeapifyDown() and return deleted element
     */
   public int poll(){
        if(size == 0 ) throw new IllegalStateException("Array Size is zero");
        int item = items[0];
        items[0] = items[size-1];
        size--;
        heapifyDown();
        return item;
   }

   public void add(int item){
       ensureExtraCapacity();
       items[size] = item;
       size++;
       heapifyUp();
   }

   //fix looking upward, incase of insert
   public void heapifyUp(){
        int index = size-1;
        while(hasParent(index) && items[index] > parent(index)){
            swap(index, getParentIndex(index));
            index = getParentIndex(index);
        }
   }


    //fix looking downward, incase of delete

    /**
     * Compare within the children
     * Pick the bigger children
     * If larger child is larger than parent ==> swap
     * continue till base condition
     */
    public void heapifyDown(){
       //starts from root
        int index = 0;
       //if left child is not there definetly right child won't bew there
       while(hasLeftChild(index)){
           int largerChildIndex = getLeftChildIndex(index);
           if(hasRightChild(index) && rightChild(index) > leftChild(index)){
               largerChildIndex = getRightChildIndex(index);
           }
           if(items[index] > items[largerChildIndex]){
               break;
           }else{
               swap(index, largerChildIndex);
           }
           index = largerChildIndex;
       }
    }

}


