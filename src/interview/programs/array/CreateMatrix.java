package interview.programs.array;

import java.util.Scanner;

public class CreateMatrix
{
    public static void main(String[] array) {
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter no of rows: ");
        int rows=ip.nextInt();
        System.out.println("Enter no of columns: ");
        int cl=ip.nextInt();
        int[][] matrixArray=new int[rows][cl];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cl;j++){
                matrixArray[i][j]=ip.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cl;j++){
                System.out.print(matrixArray[i][j]+ " ");

    }
            System.out.println();
}}}