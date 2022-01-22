package javaTPoint.java.tpoint.programs;
/**
 * 1.The Java String charAt(int index) method returns the character at the specified index in a string.
 * The index value that we pass in this method should be between 0 and (length of string-1)
 *
 * 2. In this prog we are finding is random input given by user is palindrome or not.
 * 3.We are thats why using object class String for defining our input.
 */
import java.util.Scanner;

public class PalindromeOfUnknownInputType {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number/String to be tested for palindrome :");
        String input = scanner.nextLine();

        PalindromeOfUnknownInputType palindromeOfUnknownInputType = new PalindromeOfUnknownInputType();
        palindromeOfUnknownInputType.isPalindrome(input);

    }

    public void isPalindrome(String input) {

        String reversed = "";
        int length = input.length();
        for (int i = length -1; i >= 0; i--) {

            reversed = reversed + input.charAt(i);
        }

        System.out.println(reversed);

        if (input.equals(reversed)) //since input is of string type so we are comparing using pre methods of
        //string class
        {
            System.out.println("is palindrome");
        } else {

            System.out.println("not a palindrome");
        }

    }
}
