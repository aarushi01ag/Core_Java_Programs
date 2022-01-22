package javaTPoint.java.tpoint.programs;

import java.util.Scanner;

public class FindPalindrome {

    public static void isPalindrome(int num) {
        int inputValue=num;
        int reversed = 0;
        int digit = 0;
        while (num != 0) {

            digit = num % 10;

            num = num / 10;

            reversed = reversed * 10 + digit;

        }
        System.out.println("reversed is:" +reversed);
        System.out.println(inputValue);
        if (inputValue == reversed) {
            System.out.println("Is palindrome");
        } else {
            System.out.println("Not palindrome");
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = scanner.nextInt();
        for (int i = 1; i <= size; i++) {
            System.out.println(" Enter the number: ");
            int input = scanner.nextInt();
            isPalindrome(input);


        }
    }
}
