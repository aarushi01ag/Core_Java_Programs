package javaTPoint.hashmap;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {
    public static void main(String[] args) {
        Hashtable h1 = new Hashtable();
        h1.put(1, "Tom");
        h1.put(2, "QTP");
        h1.put(3, "Test");

        Hashtable h2 = new Hashtable();
        h2 = (Hashtable) h1.clone();
        System.out.println(h1);
        System.out.println(h2);
        if (h2.equals(h1)) {
            System.out.println("***************");
            System.out.println("tables ares equal");
        }
        System.out.println("***************");
        System.out.println(h2.get(3));
        h2.clear();
        System.out.println("***************");
        System.out.println("Content in h2 is: " + h2);

        if (h1.containsValue("Tom")) {
            System.out.println("***************");
            System.out.println("value is present");
        }
        System.out.println("***************");
        System.out.println("Hashcode of h1 is: " + h1.hashCode());

        Set s = h1.entrySet();
        System.out.println("***************");
        System.out.println(s);

        Enumeration e = h1.elements();
        while (e.hasMoreElements()) {
            System.out.println("***************");
            System.out.println(e.nextElement());
        }


    }

}
