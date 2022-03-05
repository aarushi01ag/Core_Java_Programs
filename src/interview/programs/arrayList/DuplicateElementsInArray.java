package interview.programs.arrayList;

import java.util.ArrayList;
import java.util.*;

public class DuplicateElementsInArray {
    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list){

        ArrayList<Integer> newList=new ArrayList<>();
        for(int i:list){
            if(!newList.contains(i)){
                newList.add(i);
            }
        }
        return newList;

    }

    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,2,2,3,4,3,1));

        System.out.println("List with duplicate elements is: " +list);

        ArrayList<Integer> newList=removeDuplicates(list);
        System.out.println("List without duplicates is:" +newList);


        }
    }

