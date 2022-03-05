package interview.programs.array;

import java.util.Arrays;

public class removeDuplicatesWithoutSorting {
    public static void removeDuplicates(int[] arr,int n){
       int uniqueElementsCount=n;
       if(n==0||n==1){
           System.out.println(n);
       }
       for(int i=0;i<uniqueElementsCount;i++){
           for(int j=i+1;j<uniqueElementsCount;j++){
               if(arr[i]==arr[j]){
                   arr[j]=arr[uniqueElementsCount-1];
                   uniqueElementsCount--;
                   j--;
               }
           }
       }
        int[] arrayWithoutDuplicates=Arrays.copyOf(arr,uniqueElementsCount);
        System.out.println(Arrays.toString(arrayWithoutDuplicates));
    }
    public static void main(String[] args) {
        int[]arr={1,1,2,3,2,};
        int n=arr.length;
        removeDuplicates(arr,n);



    }
    }
