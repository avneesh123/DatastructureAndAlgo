package slidingWindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Anagrams {


    public static void main (String [] args){
        String s1 = "nameless";
        String s2 = "salesmen";
        System.out.println(isAnagram(s1, s2));

    }

    public static boolean isAnagram( String s1,  String s2) {
        Map<Character, Integer> anagramCharMap = new HashMap<>();
        int i = 0;
        while (s1.length() > i) {
            if (anagramCharMap.containsKey((s1.charAt(i)))) {
                int charCount = anagramCharMap.get(s1.charAt(i));
                anagramCharMap.put(s1.charAt(i), charCount + 1);
            } else {
                anagramCharMap.put(s1.charAt(i), 1);
            }
            i = i + 1;
        }
        int j = 0;
        while (s2.length() > j) {
            if (anagramCharMap.containsKey((s2.charAt(j)))) {
                int charCount = anagramCharMap.get(s2.charAt(j));
                anagramCharMap.put(s2.charAt(j), charCount - 1);
            } else {
                return false;
            }
            j = j + 1;
        }

        for (Integer count : anagramCharMap.values()){
            if(count>0) return false;
        }
        return true;
    }
}
