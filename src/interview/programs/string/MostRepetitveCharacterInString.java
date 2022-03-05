package interview.programs.string;

import java.util.HashMap;
import java.util.Map;

public class MostRepetitveCharacterInString {
    public static void main(String[] args){
        String s="Java Concept Of The Day";

       s =s.replaceAll("\\s+","");
  char[] array=s.toCharArray();
        HashMap<Character,Integer> hp=new HashMap<>();
        for(char ch: array){
            if(hp.containsKey(ch)){
                hp.put(ch,hp.get(ch)+1);
            }
            else {
                hp.put(ch,1);
            }
        }
        int maxCount=0;
        char maxChar=0;
        for(Map.Entry<Character,Integer> entry: hp.entrySet()){
            if(entry.getValue()>maxCount){
                maxCount=entry.getValue();
                maxChar=entry.getKey();
            }
        }
        System.out.println(maxChar + " " +maxCount);

    }
}
