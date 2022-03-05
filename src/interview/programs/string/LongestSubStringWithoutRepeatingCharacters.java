package interview.programs.string;

import java.util.LinkedHashMap;
import java.util.LinkedList;

public class LongestSubStringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "abcba";
        //s=s.replaceAll("\\s","");
        System.out.println(s);
        int longestSubStringLength = 0;
        String longestSubString = "";
        char[] array = s.toCharArray();
        LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<>();
        for (int i = 0; i < array.length; i++) {
            char ch = array[i];
            if (!lhm.containsKey(ch)) {
                lhm.put(ch, i);


            } else {
                i = lhm.get(ch);
                lhm.clear();
                //longestSubStringLength=0;

            }
            if (lhm.size() > longestSubStringLength) {
                longestSubStringLength = lhm.size();
                longestSubString = lhm.keySet().toString();

            }

        }

        System.out.println(longestSubString + " " + longestSubStringLength);
    }
}
