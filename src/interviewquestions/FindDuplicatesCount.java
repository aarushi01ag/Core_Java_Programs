package interviewquestions;

import java.util.HashMap;

public class FindDuplicatesCount {
    public static void main(String[] args){
        int [] array={1,3,3,5,6,5,1};
        int uniqueCount=0;
        int n=array.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:array){
            if(hm.containsKey(i)){
                hm.put(i,hm.get(i)+1);
            }
            else{
                hm.put(i,1);
            }
        }
        for(int i=0;i< array.length;i++){
            if(hm.get(array[i])==1){
                uniqueCount++;
            }
        }
        System.out.println(uniqueCount);
    }
}
