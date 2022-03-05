package interview.programs.hashmap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/*
HashMap, LinkedHashMap and TreeMap are three most popular Map types.
LinkedHashMap maintains insertion order i.e elements are stored as they are inserted.
TreeMap stores the elements according to supplied Comparator or in natural order if
you don’t supply any Comparator. HashMap doesn’t guarantee any order.
 */
public class SortHashMapByKey {
    public static void main(String[] args) {
//Sorting HashMap according to natural order of keys using TreeMap without Comparator :
        Map<String, Integer> studentMap = new HashMap<String, Integer>();

        studentMap.put("Jyous", 87);
        studentMap.put("Klusener", 82);
        studentMap.put("Xiangh", 91);
        studentMap.put("Lisa", 89);
        studentMap.put("Narayan", 95);
        studentMap.put("Arunkumar", 86);

        TreeMap<String, Integer> tm = new TreeMap<>(studentMap);
        System.out.println(tm);

        //Sorting HashMap according to natural reverse order of keys using TreeMap with Comparator :
        Map<String, Integer> studentMap2 = new HashMap<String, Integer>();

        studentMap2.put("Jyous", 87);
        studentMap2.put("Klusener", 82);
        studentMap2.put("Xiangh", 91);
        studentMap2.put("Lisa", 89);
        studentMap2.put("Narayan", 95);
        studentMap2.put("Arunkumar", 86);

        Map<String,Integer> sortedHashMap2=new TreeMap<>(Collections.reverseOrder());
        sortedHashMap2.putAll(studentMap2);
        System.out.println(sortedHashMap2);

    }
}
