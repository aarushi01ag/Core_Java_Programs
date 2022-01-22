package javaTPoint.java.tpoint.programs;

public class FibonacciSeriesWithoutRecurssion {
    static int a=0;
    static int b=1;
    static int c=0;
    public static void fibonacci(int count){
        if(count>0) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(" "+c);
            fibonacci(count-1);
        }
    }
    public static void main(String[] args){
        int count=10;
        System.out.print(a+ " "+b);
        fibonacci(count-2);



    }
}
