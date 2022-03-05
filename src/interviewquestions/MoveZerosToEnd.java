package interviewquestions;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args){
        moveZerosToEnd();
        moveZerosToStart();
    }
    public static void moveZerosToEnd(){
        int[] array={1,0,-1,8,0,9,6,0};
        int counter=0;
        int n=array.length;
        for(int i=0;i<n;i++){
            if(array[i]!=0){
                array[counter]=array[i];
                counter++;
            }
        }
        for(int i=counter;i<n;i++){
            array[counter]=0;
            counter++;
        }
        System.out.println(Arrays.toString(array));}

    public static void moveZerosToStart(){
        int[] array2={4,6,0,8,1,0,0};
        int n= array2.length;
        int counter=n-1;
        for(int i=n-1;i>=0;i--){
            if(array2[i]!=0){
                array2[counter]=array2[i];
                counter--;
            }
        }
        for(int i=counter;i>=0;i--){
            array2[counter]=0;
            counter--;
        }
        System.out.println(Arrays.toString(array2));
    }
}
