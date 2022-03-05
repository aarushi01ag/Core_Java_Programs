package interview.programs.tpoint.programs;

import java.util.Scanner;

/*
pronic numbers are those which are the product of two consecutive integers i.e n*(n+1).
 */
public class PronicNumber {
    public static void main(String[] args){
        int number=6;
        int squareRoot=(int)Math.sqrt(number);
        if(squareRoot*(squareRoot+1)==number){
            System.out.println("is pronic");
        }
        else{
            System.out.println("not pronic");
        }
    }
}
