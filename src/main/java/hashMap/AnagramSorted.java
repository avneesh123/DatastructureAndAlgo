package hashMap;

/**
 * Question-
 * Input is array of strings ["code", "doce", "apple", "pplae", "ecod", "anagram"]
 * Take first string and find it its anagram and remove it and return the sorted array
 */

import java.util.HashMap;
import java.util.Map;

/**
 * Approach - Use Merge Sort as it is stable
 * when comparing check if its anagram if it is no need to insert it...
 */

public class AnagramSorted {

    public static void main (){
        String [] anagramsArr = {"code", "doce", "apple", "pplae", "ecod", "anagram"};


    }



    private static boolean isAnagram(String str1, String str2){

        Map<Character, Integer> charCount = new HashMap<>();

        for (int i=0; i< str1.length(); i++ ){
            if (!charCount.containsKey(str1.charAt(i))){
                charCount.put(str1.charAt(i), 0);
            }
            charCount.put(str1.charAt(i), charCount.get(str1.charAt(i))+1);
        }

        for (int i=0; i< str2.length(); i++ ){
            if (!charCount.containsKey(str2.charAt(i))){
                return false;
            }
            charCount.put(str1.charAt(i), charCount.get(str1.charAt(i))-1);
        }

        for (Integer count : charCount.values()){
            if (count != 0) return false;
        }
        return true;
    }

    private static void mergeSort(){

    }

}
