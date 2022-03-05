package interview.programs.array;

import java.util.Arrays;

public class SortArrayInAscendingOrder {
    public static void main(String[] args){
        int[] arr ={5, 2, 8, 7, 1};
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++)
        if(arr[i]>arr[j]){
            temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;

        }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("second largest is:- " +arr[arr.length-2]);
        System.out.println("third largest is: "+arr[arr.length-3]);
        System.out.println("kargest element is:- " +arr[arr.length-1]);
    }
}
