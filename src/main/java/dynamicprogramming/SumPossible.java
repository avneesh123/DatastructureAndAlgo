package dynamicprogramming;

import java.util.HashMap;
import java.util.Map;

/**
 * Write a function sumPossible that takes in an amount and an array of positive numbers.
 * The function should return a boolean indicating whether or not it is possible to create the amount by summing numbers of the array.
 * You may reuse numbers of the array as many times as necessary.
 * You may assume that the target amount is non-negative.
 * test_00:
 * sumPossible(8, [5, 12, 4]); // -> true, 4 + 4
 * sumPossible(15, [6, 2, 10, 19]); // -> false
 */
public class SumPossible {

    public static void main (String [] args){
        Map<Integer, Integer> memoized = new HashMap<>();
        System.out.println(calculate(600, memoized));
    }

    public static boolean sumPossible(int n, Map<Integer, Integer> memoized){
        if (memoized.containsKey(n)) return memoized.get(n);
        if (n==0 || n==1) return 0;
        if (n==2) return 1;

        memoized.put(n, calculate(n-1, memoized) +  calculate(n-2, memoized)+  calculate(n-3, memoized)) ;
        return memoized.get(n);
    }
}
