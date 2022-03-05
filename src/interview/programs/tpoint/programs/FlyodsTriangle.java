package interview.programs.tpoint.programs;

public class FlyodsTriangle {
    public static void main(String[] args){
        int numberOfRows=3;
        int value=1;
        for(int i=1;i<=numberOfRows;i++){
         for(int j=1;j<=i;j++){
             System.out.print(value+" ");
             value++;
         }
         System.out.println();
        }
    }
}
