package interview.programs.array;
/*
Write a Java program or function which takes two sorted integer arrays as input and merge them in sorted order
 */

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args){
    int[] arrayA = {-7, 12, 17, 29, 41, 56, 79};
    int[] arrayB = {-9, -3, 0, 5, 19};
    int[] mergedArray=new int[arrayA.length+arrayB.length];
    int i=0;int j=0;int k=0;
    while(i<arrayA.length && j<arrayB.length ){
        if(arrayA[i]<arrayB[j]){
            mergedArray[k]=arrayA[i];
            k++;
            i++;
        }
        else{
            mergedArray[k]=arrayB[j];
            j++;
            k++;
        }
    }
    while(i<arrayA.length){
        mergedArray[k]=arrayA[i];
        i++;
        k++;
    }
        while(j<arrayB.length){
            mergedArray[k]=arrayB[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(mergedArray));
}}
