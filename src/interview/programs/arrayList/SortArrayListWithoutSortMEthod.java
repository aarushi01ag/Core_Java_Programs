package interview.programs.arrayList;

import java.util.*;

public class SortArrayListWithoutSortMEthod {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<>();
        l.add("aaru");
        l.add("vineet");
        l.add("Bannu");
        l.add("palak");
       TreeSet<String> lp=new TreeSet<>(new Comparator<String>() {

           @Override
           public int compare(String o1, String o2) {
               return o1.compareTo(o2);
           }
       });
        lp.addAll(l);

//        System.out.println(lp);
        Iterator<String> it=lp.iterator();
       while(it.hasNext()){

           System.out.println("Array list in asc order" +it.next());
       }

//        for (int i = 0; i < l.size() - 1; i++) {
//            for (int j = i + 1; j < l.size(); j++) {
//                int temp = 0;
//
//                if (l.get(i) > l.get(j)) { //for descending order just change the greater to less than sign
//                    temp = l.get(i);
//                    l.set(i, l.get(j));
//                    l.set(j, temp);
//                }
//            }
//
//        }
//        System.out.println(l);
    }}
