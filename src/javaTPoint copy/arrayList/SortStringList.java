package javaTPoint.arrayList;

import java.util.*;

public class SortStringList {
    public static List<String> sortList(List<String> list){
        System.out.println("List before sorting :" +list);
            Collections.sort(list,String::compareToIgnoreCase);
        return list;
    }

    public static void main(String[] args){
        List<String> list=new ArrayList<>(Arrays.asList("mamta","billi","Nehal","Aarushi"));
        List<String> output=sortList(list);
        System.out.println(output);
    }
}
