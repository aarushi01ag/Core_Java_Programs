package javaTPoint.java.tpoint.programs;

import java.util.Scanner;

public class IsPalindrome {
    /**
     * This program will find the palindrome of a numbers which stays same even after reversal
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = scanner.nextInt();

        IsPalindrome isPalindrome = new IsPalindrome();
        isPalindrome.palindromeOrNot(n);


    }

    public void palindromeOrNot(int n) {
        int number = n;
        int digit = 0;
        int reversed = 0;

        while (n != 0) {
            digit = n % 10;
            reversed = reversed * 10 + digit;
            n = n / 10; //divison givees quotien and modulus gives remainder
        }

        System.out.println(reversed);
        if (number == reversed) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }

    }

}
