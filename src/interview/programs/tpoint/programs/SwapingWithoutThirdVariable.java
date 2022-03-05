package interview.programs.tpoint.programs;
import java.util.Scanner;
public class SwapingWithoutThirdVariable {
    public static void swapping(int a, int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("numbers after swapping are: " +a + "   "+b);
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the numbers which you want to swap");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        System.out.println("Numbers before swapping are :" +a +"  " +b);
        swapping(a,b);


    }
}
