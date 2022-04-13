package interview.GeeksForGeeks;

import java.util.Set;
import java.util.TreeSet;
//this method will remove duplicates
public class CommonCharactersOfStringInAlphabaticalOrder {
    public static void main(String[] args){
        String s1="hhhhhello";
        String s2="gfghhmh";
        char[] a1=s1.replaceAll(" ","").toCharArray();
        char[] a2=s2.replaceAll(" ","").toCharArray();
        Set<Character> set1=new TreeSet<Character>();
        Set<Character> set2=new TreeSet<Character>();
        for(char c:a1){
            set1.add(c);
        }
        for(char c:a2){
            set2.add(c);
        }
        set1.retainAll(set2);
        System.out.println(set1);
    }
}
