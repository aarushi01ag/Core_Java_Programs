package interviewquestions;

import java.util.Arrays;

public class ArrangeMaxAtEvenAndMinAtOddIndex {
    public static void main(String[] args){
        int[]arr={1,2,3,4,5};
        int n= arr.length;;
        int counter=0;
        int[] result=new int[n];
        for(int i=0;i<n;i++){
            if(i%2==0){
            result[i]=arr[n-1-counter];
        }
        else{result[i]=arr[counter];
        counter++;}}System.out.println(Arrays.toString(result));
    }
}
