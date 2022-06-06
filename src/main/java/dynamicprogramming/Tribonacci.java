package dynamicprogramming;

import java.util.HashMap;
import java.util.Map;

/**
 * Write a function tribonacci that takes in a number argument, n, and returns the n-th number of the Tribonacci sequence.
 *
 * The 0-th and 1-st numbers of the sequence are both 0.
 *
 * The 2-nd number of the sequence is 1.
 *
 * To generate further numbers of the sequence, calculate the sum of previous three numbers.
 *
 * Solve this recursively.
 */
public class Tribonacci {
    /**
     * Space Complexity --> O(n)
     * Time Complexity --> O(n)
     * @param args
     */
    public static void main (String [] args){
        Map<Integer, Integer> memoized = new HashMap<>();
        System.out.println(calculate(600, memoized));
    }

    public static int calculate(int n, Map<Integer, Integer> memoized){
        if (memoized.containsKey(n)) return memoized.get(n);
        if (n==0 || n==1) return 0;
        if (n==2) return 1;

        memoized.put(n, calculate(n-1, memoized) +  calculate(n-2, memoized)+  calculate(n-3, memoized)) ;
        return memoized.get(n);
    }


}
