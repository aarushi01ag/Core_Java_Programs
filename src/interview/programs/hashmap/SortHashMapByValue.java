package interview.programs.hashmap;

import java.util.*;
/* Solution:
Get listOfEntry consisting of all Entry objects of HashMap using entrySet() method.
Sort listOfEntry using Collections.sort() method by passing customized Comparator.
Insert all elements of sorted listOfEntry into new LinkedHashMap which maintains insertion order.

 */
public class SortHashMapByValue {
    public static void main(String[] args) {
        HashMap hp1 = new HashMap();
        hp1.put(1, 3);
        hp1.put(2, 5);
        hp1.put(3, 4);

        ArrayList<Map.Entry<Integer, Integer>> list = new ArrayList<>(hp1.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        Map<Integer, Integer> Lhp = new LinkedHashMap<>();
        for (Map.Entry<Integer, Integer> e : list){
            Lhp.put(e.getKey(),e.getValue());
        }
        System.out.println(Lhp);

    }
}
