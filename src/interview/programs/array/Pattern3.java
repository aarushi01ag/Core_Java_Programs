package interview.programs.array;

import java.util.Scanner;

/*
                  1
                1 2 1
              1 2 3 2 1
            1 2 3 4 3 2 1
          1 2 3 4 5 4 3 2 1
        1 2 3 4 5 6 5 4 3 2 1
      1 2 3 4 5 6 7 6 5 4 3 2 1
    1 2 3 4 5 6 7 8 7 6 5 4 3 2 1
  1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1
 */
public class Pattern3 {
public static void main(String[] args){
    Scanner ip=new Scanner(System.in);
    int noOfRows=ip.nextInt();

    int rowCount=1;
    for(int i=noOfRows;i>0;i--){
        for(int j=1;j<=i*2;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=rowCount;j++) {
            System.out.print(j + " ");
        }
        for(int j=rowCount-1;j>=1;j--){
            System.out.print(j+" ");
        }
        System.out.println();
        rowCount++;
    }
}
}
