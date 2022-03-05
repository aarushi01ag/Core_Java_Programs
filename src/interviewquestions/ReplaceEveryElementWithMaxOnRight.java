package interviewquestions;

import java.util.Arrays;

/*
A tricky method is to replace all elements using one traversal of the array.
The idea is to start from the rightmost element, move to the left side one by one,
and keep track of the maximum element. Replace every element with the maximum element.

 */
public class ReplaceEveryElementWithMaxOnRight {
    public static void main(String[] args){
        int[] arr={16, 17, 4, 3, 5, 2};
        int n=arr.length;
        int maxFromRight=arr[n-1];
        arr[n-1]=-1;
        for(int i=n-2;i>=0;i--){
            int temp=arr[i];
            arr[i]=maxFromRight;
            if(maxFromRight<temp){
                maxFromRight=temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
