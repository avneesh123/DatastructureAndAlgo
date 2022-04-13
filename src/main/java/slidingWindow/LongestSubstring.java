package slidingWindow;

import java.util.HashSet;
import java.util.Set;

//longest substring with repeating char
//pwwkew has answer 3 ==> wke or kew
public class LongestSubstring {

    public static void main (String [] args){
        //0  1  2  3  4 5
        //p  w  d  w  e s w
    //             i
    //             j

        //check before add inf is the char is there
        //as i moved add to a hashset [p, w]
        // when we found duplicate stop i and start inc j until it equal to i
        // as j moved delete f rom hasset as we need to start fresh

       System.out.println(findLongestSubstring("pwwke"));
    }

    public static  int findLongestSubstring(String longString){

        int i=0;
        int j=0;
        int maxLength =0;
        int currentLength =0;
        Set<Character> substringChars  = new HashSet<>() ;
        while(longString.length() >  i ){
            if(substringChars.contains(longString.charAt(i))){
                while (j != i){
                    substringChars.remove(longString.charAt(i));
                    j=j+1;
                }
            }
            currentLength = i-j+1 ;
            System.out.println("For char  - " + longString.charAt(i)+ " length is - " +currentLength);
            substringChars.add(longString.charAt(i));
            i =i+1;
            if(maxLength < currentLength) maxLength = currentLength;
        }

        return maxLength;
    }
}
