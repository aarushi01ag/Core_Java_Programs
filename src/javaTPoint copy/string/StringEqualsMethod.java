package javaTPoint.string;

import java.util.ArrayList;

public class StringEqualsMethod {

    String s1 = "javatpoint";
    String s2 = "javatpoint";
    String s3 = "Javatpoint";

    ArrayList<String> list=new ArrayList<>();

    public static void main(String[] args){


        StringEqualsMethod equalsObj=new StringEqualsMethod();

        System.out.println(equalsObj.s1.equals(equalsObj.s2));
        System.out.println(equalsObj.s3.equals(equalsObj.s2));
        equalsObj.list.add("java");
        equalsObj.list.add("point");
        equalsObj.list.add("t");
        equalsObj.list.add("Java");
        equalsObj.list.add("Point");
        for(String str:equalsObj.list){
            if(str.equals(equalsObj.s1)){
                System.out.println("list is true");
            }
            else
                System.out.println("list is false");

        }

    }


}
