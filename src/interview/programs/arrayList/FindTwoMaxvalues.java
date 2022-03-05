package interview.programs.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTwoMaxvalues {
    public static void findTwoMax(ArrayList<Integer> list){
        int max1=0;
        int max2=0;
        for(int element:list){
            if(max1<element){
                max2=max1;
                max1=element;

            }
            else if(max2<element){
                max2=element;
            }
        }
        System.out.println(+max1 +"    "   +max2);
    }

    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(15,24,48,21,43,11,79,93));
       findTwoMax(list);

    }
}
