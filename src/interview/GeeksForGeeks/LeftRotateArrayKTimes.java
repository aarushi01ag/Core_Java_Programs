package interview.GeeksForGeeks;

import java.util.Arrays;

public class LeftRotateArrayKTimes {
    public static void main(String[] args){
        int[] array={1, 2, 3, 4, 5, 6, 7};
        int n= array.length;;
        int k=3;
        int temp;
        for(int j=0;j<k;j++){
         temp=array[0];
         int i;
        for( i=0;i< array.length-1;i++){
            array[i]=array[i+1];
        }array[i]=temp;}

        System.out.println(Arrays.toString(array));
    }
}
