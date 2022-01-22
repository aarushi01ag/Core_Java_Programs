package javaTPoint.array;

import java.util.Arrays;

public class CopyingArrayToAnotherArray {

    String[] array1={"aarushi","anurag","renu","rajeev"};
    String[] array2=new String[4];

    public void copyArrayUsingInBuiltFunction(){

        System.out.println(Arrays.toString(array2));
        System.arraycopy(array1,1,array2,0,3);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

    }

    public void copyArraysUsingLoop(){
        for(int i=0;i<array1.length;i++){
            array2[i]=array1[i];
        }

        System.out.println("Printing array 1:-");
        for(int i=0;i<array1.length;i++){
            System.out.print(array1[i] + " ");
        }

        System.out.println("\nprinting array2:-");
        for(int i=0;i<array1.length;i++){
            System.out.print(array2[i] + " ");

           System.out.println(array2.getClass().getName());

    }

    for(String output:array2){//for printing we can use for each loop as well
        System.out.println(output);
    }
    }

    public static void main(String[] args){
        CopyingArrayToAnotherArray duplicateArray=new CopyingArrayToAnotherArray();
        duplicateArray.copyArrayUsingInBuiltFunction();
        duplicateArray.copyArraysUsingLoop();
        String className=duplicateArray.array2.getClass().getName();
System.out.println("\n"+className);
    }

}
