package interview.programs.array;

import java.util.Arrays;

public class ReverseArray {
    String[] arr1={"Aarushi","Renu","Anurag"};
    String[] arr2=new String[3];
    int j=arr1.length;

    public void reversingArray() {
        for (int i=0;i<arr1.length;i++) {
            arr2[j-1]=arr1[i];
            j=j-1;

        }
        System.out.println(Arrays.toString(arr2));

    }
    public static void reverseArrayUsingStringBuffer(){
        String[] arr = {"Hello", "World"};
        StringBuilder reversed = new StringBuilder();

        for (int i = arr.length; i > 0; i--) {
            reversed.append(arr[i - 1]).append(" ");
        };

        String[] reversedArray = reversed.toString().split(" ");

        System.out.println(Arrays.toString(reversedArray));
    }

    public static void main(String[] args){

        ReverseArray obj=new ReverseArray();
        obj.reversingArray();
        //System.out.println(arr1);

}}
