package interview.GeeksForGeeks;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class replaceVowelsFromString {
    public static void main(String [] args){
        String s="GeeeksforGeeks - A Computer Science Portal for Geeks2";
        Character[] vowels={'a','e','i','o','u','A','E','I','O','U'};
        List<Character> list= Arrays.asList(vowels);
        StringBuffer sb=new StringBuffer(s);
        for(int i=0;i<sb.length();i++){
            if(list.contains(sb.charAt(i))){
                sb.replace(i,i+1,"");
                i--;
            }
        }
        System.out.println(sb);
    }
}
