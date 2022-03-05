package interview.programs;

import kotlin.jvm.Synchronized;
import org.w3c.dom.Node;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadLocalRandom;

public class Rough {


    public static void main(String[] args) {
        int num=1546;
        String roman="";
        LinkedHashMap<Integer, String> lhp = new LinkedHashMap<>();
        lhp.put(1000, "M");
        lhp.put(900, "CM");
        lhp.put(500, "D");
        lhp.put(400, "CD");
        lhp.put(100, "C");
        lhp.put(90, "XC");
        lhp.put(50, "L");
        lhp.put(40, "XL");
        lhp.put(10, "X");
        lhp.put(9, "IX");
        lhp.put(5, "V");
        lhp.put(4, "IV");
        lhp.put(1, "I");
        while(num!=0){
            for(int i:lhp.keySet()){
                if(num>=i){
                    roman=roman+lhp.get(i);
                    num=num-i;
                }

            }
        }
        System.out.println(roman);
    }
}



