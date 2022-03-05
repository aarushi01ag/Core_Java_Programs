package interview.programs.string;

import java.util.*;

public class FindConcurrentDuplicates {
    public static void main(String [] args){
        int[] arr={1,3,4,4,4,6,7,7};
        int temp=0;
        LinkedHashSet<Integer> duplicates=new LinkedHashSet<>();
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                if(!duplicates.contains(arr[i])){
                   duplicates.add(arr[i]);
                }


            }
        }
        System.out.println(duplicates);

    }
}
