package linkedList;

import java.util.*;

/**
 * Write a function, linkedPalindrome, that takes in the head of a linked list as an argument. The function should return a boolean indicating whether or not the linked list is a
 * palindrome. A palindrome is a sequence that is the same both forwards and backwards.
 *
 */
public class LinkedPalindrome {

    class Node {
        int value;
        Node next;
        Node(int val){
            this.value = val;
            this.next = null;
        }

    }

    public static boolean isPalindromeLinked(Node head){
        //reverse a linked list and compare
        int[] arr = convertLinkedListToArrayList(head);

        int i=0, j = arr.length-1;
        while(i< arr.length ){
            if(i==j) return true;
            if(arr[i] != arr[j]) return false;
            i=i+1;
            j=j-1;
        }
        return true ;
    }

    public static int[] convertLinkedListToArrayList(Node head){
        int [] arr = new int [6] ;
        Node current = head;
        Stack<Node> stack = new Stack<>();
        stack.add(current);
        int i=0;
        while(current != null){
            current = stack.pop();
            arr[i] = current.value;
             current = current.next;
            if(current != null) stack.add(current);
            i=i+1;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

}
