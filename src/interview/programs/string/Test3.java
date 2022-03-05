package interview.programs.string;

import java.util.*;

public class Test3 {

    public static void findFreq(String str) {

        char[] arr=str.toCharArray();
        LinkedHashMap<Character,Integer> freq=new LinkedHashMap<Character, Integer>();
        for(char c:arr){
            if(freq.containsKey(c)){
                freq.put(c,freq.get(c)+1);
            }
            else{
                freq.put(c,1);
            }
        }


            for(Map.Entry<Character,Integer> e: freq.entrySet()){
                if(e.getValue()==1){
                    System.out.println(e.getKey());
                    break;
                }
            }
        }



    public static void main(String[] args) {
        String s1 = "adaaadbc";
        String s2="alaakn";
        findFreq(s2);
        int[] arrayOfString={1,3,4,5,6};
        System.out.println("arrayOfString is" + Arrays.toString(arrayOfString));

    }
}
