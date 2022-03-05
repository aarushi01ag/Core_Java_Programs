package interview.programs.arrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class WaysToCreateArrayList {
    public static void main(String[] args){
        ArrayList list=new ArrayList(); //this creates an arraylist of initial capacity 10
        ArrayList list2=new ArrayList(20);//This creates an arraylist of size 20
        ArrayList list3=new ArrayList(list); //this create an arraylist from a collection

        LinkedList<String> ll=new LinkedList<>();
        ll.add("1");
        ll.add("3");
        ll.add("4");
        ll.add("1");
        ll.add("5");
        //System.out.println(queue.poll());
        System.out.println(ll);
       //queue.removeFirstOccurrence(123);
       //System.out.println(queue);
       //queue.removeLastOccurrence(123);
      // System.out.println(queue);
       System.out.println(ll.lastIndexOf(1));

    }
}
