package interview.programs.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
Ques: merger two arrays into one with no duplicates and merged array to be in sorted order
Sol: Merge the two array, remove duplicates uing hashset as it contains only unique elements and then
sort mergedArrayWithNoDuplicates.
 */
public class Merge2ArrayListIntoSingleSortedArrayWithoutDuplicates {
    public static void main(String[] args){
        int[] array1={7, -5, 3, 8, -4, 11, -19, 21};
        int[] array2={6, 13, -7, 0, 11, -4, 3, -5};
        int[] mergerarray=new int[array1.length+array2.length];
        int i=0;int j=0;int k=0;
        while(i<array1.length){
            mergerarray[k]=array1[i];
            k++;
            i++;
        }
        while(j<array2.length){
            mergerarray[k]=array2[j];
            k++;
            j++;
        }
        System.out.println("MergerArray is"+ Arrays.toString(mergerarray));
        Set<Integer> set=new HashSet<>();
        for(int element:mergerarray){
            set.add(element);
        }
        System.out.println(set);
        int[] mergedArrayWithoutDuplicates=new int[set.size()];
        Iterator<Integer> it=set.iterator();
        int n=0;
        while(it.hasNext()){
            mergedArrayWithoutDuplicates[n]=it.next();
            n++;
        }
        System.out.println(Arrays.toString(mergedArrayWithoutDuplicates));
        Arrays.sort(mergedArrayWithoutDuplicates);
        System.out.println(Arrays.toString(mergedArrayWithoutDuplicates));

    }
}
