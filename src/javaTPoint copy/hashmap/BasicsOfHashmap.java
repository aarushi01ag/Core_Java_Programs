package javaTPoint.hashmap;

import java.util.HashMap;
import java.util.Map.Entry;

public class BasicsOfHashmap {
    public static void main(String[] args)

    {
        HashMap<Integer, String> hm=new HashMap<Integer, String>();
        hm.put(1,"Selenium");
        hm.put(2,"QTP");
        hm.put(3,"TestComplete");
        System.out.println(hm.get(1));
        hm.put(4,"aarushi");
        System.out.println(hm);
        hm.remove(3);
        System.out.println(hm);
        for(Entry m: hm.entrySet()){
            System.out.println(m.getKey() + " " +m.getValue());
        }

        HashMap<Integer, Employee> hm2=new  HashMap<Integer, Employee>();
        Employee e1=new Employee("sonu",23);
        Employee e2=new Employee("titu",45);
        hm2.put(1,e1);
        hm2.put(2,e2);
        System.out.println("***********************");
        for(Entry<Integer,Employee> m2:hm2.entrySet()){
            int key=m2.getKey();
            Employee e=m2.getValue();//e is poinitng to all objects of employess class bcz m2.getValue has all values of the hashmap
            System.out.println(key + "employee info is" );
            System.out.println(e.name+ " " +e.age);
        }



    }
}
