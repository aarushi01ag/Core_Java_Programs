package interview.programs.alogorithms;

import java.util.Arrays;

/*
Selection sort works on two params SELECTION and PLACEMENT.
Working: It first selects the lowest or highest element at index 1 to arr.length-1 and replaces it with first element i.e index 0.
Then again selects highest or lowest elements at index 2to arr.length-2 and replace with element at index 1.

Performance: Worst Case : O(n^2)
Average Case : O(n^2)
Best Case : O(n^2)
Not suitable for large size arrays.

 */
public class SelectionSort {
    public static void main(String[] args){
        int [] arr={45, 84, 101, 62, 12, 45};
        int temp,pos;
        for(int i=0;i<arr.length-1;i++){
            pos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[pos]){
                    pos=j;
                }
            }
            temp=arr[i];
            arr[i]=arr[pos];
            arr[pos]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }


}
