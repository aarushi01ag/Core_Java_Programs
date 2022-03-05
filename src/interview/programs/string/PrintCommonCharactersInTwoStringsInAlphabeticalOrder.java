package interview.programs.string;

import java.util.Set;
import java.util.TreeSet;
/*
Tree set removes duplicates and maintains alphabetical order
 */
public class PrintCommonCharactersInTwoStringsInAlphabeticalOrder {
    public static void main(String[] args){
        String s1="thin sticks";
        String s2="thick bricks";
        char[] array1=s1.replaceAll("\\s+","").toCharArray();
        char[] array2=s2.replaceAll("\\s+","").toCharArray();
        Set <Character> set1=new TreeSet<>();
        Set<Character> set2=new TreeSet<>();
        for(char ch:array1){
            set1.add(ch);
        }
        for(char ch: array2){
            set2.add(ch);
        }
        set1.retainAll(set2);
        System.out.println(set1);
        System.out.println(set1.size());



    }
}
