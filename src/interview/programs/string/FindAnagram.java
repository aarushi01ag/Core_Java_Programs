package interview.programs.string;

import java.util.Arrays;

public class FindAnagram {
    public static void main(String[] args){
        String s1="Grab";
        String s2="Brag";
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        if(s1.length()!=s2.length()){
            System.out.println("Not an anagram");

        }
        else{char[] array1=s1.toCharArray();
        char[] array2=s2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);
        if(Arrays.equals(array1,array2))
             {
                System.out.println("anagram");
            }}
    }
}