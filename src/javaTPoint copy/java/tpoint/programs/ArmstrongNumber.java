package javaTPoint.java.tpoint.programs;

public class ArmstrongNumber {
    public static void armstrongNumber(int n, int a, int c){
        int temp=n;
        while(n>0){
            a=n%10;
            n=n/10;
            c=c+(a*a*a);

        }
        if(temp==c){
            System.out.println("armstrong");

        }
        else{
            System.out.println("Not armstrong");
        }
    }
    public static void main(String[] args){
        int number=153;
        int a=0;
        int c=0;
        armstrongNumber(number,a,c);
    }
}
