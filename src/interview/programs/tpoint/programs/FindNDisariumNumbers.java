package interview.programs.tpoint.programs;

import java.util.Scanner;

public class FindNDisariumNumbers {
    public static boolean findDisarium(int number){
      int temp=number;
      int sum=0;
      int len=String.valueOf(number).length();
      while(temp>0){
          int lastDigit=temp%10;
          sum=sum+(int)Math.pow(lastDigit,len);
          len--;
          temp=temp/10;
      }
      if(sum==number){
       return true;
      }
      else{
         return false;
      }
    }
    public static void main(String[] args){
        Scanner ip=new Scanner(System.in);
        System.out.println("Enter count of disarium number required");
        int count=ip.nextInt();
        int counter=1;
        int number=60;
        System.out.println("First"+count+" "+"disarium numbers are: ");
        while(counter<=count){
            if( findDisarium(number)){
                System.out.println(number);
                counter++;
                number++;
            }else{
                number++;
            }
    }
    ip.close();}
}
