package javaTPoint.string;

import java.util.HashMap;
import java.util.Map;

public class Test2 {

    /** write a func to display charcter freq of "aarushi"
     *
     */


    public static void getFreq(char[] arr){
       int len=arr.length;
        HashMap<Character,Integer> hm=new HashMap<Character, Integer>();
        for(char c:arr){
            if(hm.containsKey(c)){
                hm.replace(c,hm.get(c)+1);
            }
            else{
                hm.put(c,1);
            }

        }
        System.out.println("Character"+ "|" +"Frequency");
        for(Map.Entry entry:hm.entrySet()){
            System.out.println(entry.getKey()+"  |  " +entry.getValue());
        }

    }



    public static void main(String[] args){
        char[] array={'a','a','r','u','s','h','i'};
        getFreq(array);
    }

}

