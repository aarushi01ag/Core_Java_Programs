package interview.programs.hashmap;

import java.util.HashMap;

public class MergeTwoHashMap {
    public static void main(String[] args){
        HashMap<String,Integer> hp1=new HashMap<>();
        hp1.put("Maths",23);
        hp1.put("Physics",45);
        hp1.put("Bio",67);

        HashMap<String,Integer> hp2=new HashMap<>();
        hp2.put("Maths",45);
        hp2.put("eng",78);

        HashMap<String,Integer>hp3=new HashMap<>(hp1);
        hp2.forEach((key,value)->hp3.merge(key,value,(v1,v2)->(v1+v2)));
        System.out.println(hp3);


    }
}
