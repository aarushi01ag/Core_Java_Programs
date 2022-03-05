package interviewquestions;

import java.util.HashMap;

/*
Find first unique character in the string and return -1 if no character is unique
 */
public class FirstUniqueCharacterIndex {
    public static int printUniqueCharacterIndex(){
        String s="maddaamguuui";
        int n=s.length();
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)+1);
            }
            else{
                hm.put(ch,1);
            }
        }
        for(int i=0;i<n;i++){
            if(hm.get(s.charAt(i))==1){
               return i;
            }
        }
        return  -1;
    }
    public static void main(String[] args){
        System.out.println(printUniqueCharacterIndex());
    }
}
