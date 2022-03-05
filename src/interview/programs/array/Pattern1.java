package interview.programs.array;

import java.util.Scanner;
/*
    1
   2 2
  3 3 3
 */
public class Pattern1 {
public static void main(String[] args){
    int rowCount=1;
    Scanner ip=new Scanner(System.in);
    System.out.println("Enter no of rows");
    int noOfRows=ip.nextInt();
    for(int i=noOfRows;i>0;i--){

        for(int j=1;j<=i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=rowCount;j++){
        System.out.print(rowCount+" ");}
            System.out.println();
            rowCount++;
        }
    }
}
