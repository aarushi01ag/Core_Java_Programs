package interview.programs.array;

import java.util.*;

/*
Write a Java program or function which takes an integer array as input and sort array elements in descending order
of their frequency. If any two or more elements have same frequency then print which comes first. For example,
if [7, 1, 3, 4, 7, 1, 7, 1, 4, 5, 1, 9, 3] is an input array then its elements in descending order of their
frequency will be [ 1 1 1 1 7 7 7 3 3 4 4 5 9 ].

Solution: we first find the frequency of all the elements using hash map.Then we prepare an array list of map.
By using the Comparator Interface, compare the frequency of an elements in a given list.
by using this comparator to sort the list by implementing Collections.sort() method.
Print the sorted list.
 */
public class SortArrayElementsByFrequency {
    public static void main(String[] args){
        int[] array={7, 1, 3, 4, 7, 1, 7, 1, 4, 5, 1, 9, 3};
        HashMap<Integer,Integer> hp=new HashMap<>();
        for(int i:array){
            if(hp.containsKey(i)){
                hp.put(i,hp.get(i)+1);
            }
            else {
                hp.put(i,1);
            }
        }
        ArrayList<Map.Entry<Integer,Integer>> list=new ArrayList<>(hp.entrySet());
        System.out.println(list);
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        System.out.println(list);
       for(Map.Entry<Integer,Integer> entryList: list){
           int freq=entryList.getValue();
           while(freq>=1){
               System.out.print(entryList.getKey()+ " ");
               freq--;
           }
       }
    }
}
