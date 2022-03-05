package interviewquestions;

import java.util.Arrays;

public class FindProductOfArrayElementsWithoutItself {
    public static void main(String[] args){
        int array[]={1, 2, 3, 4, 5};
        int n=array.length;
        int left[]=new int[n];
        int right[]=new int[n];
        int product[]=new int[n];
        left[0]=1;
        right[n-1]=1;
        for(int i=1;i<n;i++){
            left[i]=array[i-1]*left[i-1];
        }
        for(int i=n-2;i>=0;i--){
            right[i]=right[i+1]*array[i+1];
        }
        for(int i=0;i<n;i++){
            product[i]=left[i]*right[i];
        }
        System.out.println(Arrays.toString(product));

    }
}
