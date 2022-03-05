package interview.programs.tpoint.programs;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args)
    {
        int reverse=0;

        Scanner input=new Scanner(System.in);
        System.out.println("please enter the number:");
        int number=input.nextInt();
        while(number!=0){
            int digit=number%10;
            number=number/10;
            reverse=reverse*10 + digit;

        }
        System.out.println(reverse);
    }
}
