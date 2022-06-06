package arrays;

import java.util.ArrayList;
import java.util.List;

public class OverlappingIntervals {

    public  static class Pair{
        private int low;
        private int high;
        Pair(int low, int high){
            this.low = low;
            this.high = high;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "low=" + low +
                    ", high=" + high +
                    '}';
        }
    }

    public static void main (String [] args){

        Pair[] pairs = {new Pair(1, 5), new Pair(3, 7), new Pair(4, 6),
                new Pair(10, 12), new Pair(12, 15) };
        List<Pair> overlapTime = findOverlappingInterval(pairs);
        System.out.println(overlapTime);

    }

    public static List<Pair> findOverlappingInterval(Pair[] pairs){
        int i=0, k=0, j=1;
        List<Pair> overlapTime = new ArrayList<>();
        while(k < pairs.length ){
            if( j < pairs.length && pairs[k].high >= pairs[j].low  ){
                k++;
                j++;
            }else {
                //extract overlap times
                overlapTime.add(new Pair(pairs[i].low, pairs[k].high));
                i=j;
                k=j;
                j++;
            }
            System.out.println(k);
        }
        return overlapTime;
    }





}
