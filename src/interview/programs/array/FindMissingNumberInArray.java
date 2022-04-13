package interview.programs.array;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
//This method returns the element present at the top of the stack and then removes it.
// Exceptions: The method throws EmptyStackException is thrown if the stack is empty.
public class FindMissingNumberInArray {
    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '[':
                case '{':
                case '(':
                    stack.push(s.charAt(i));
                    break;
                case '}':
                    if (stack.empty() || !stack.pop().equals('{')) {

                        return false;
                    }
                    break;
                case ']':
                    if (stack.empty() || !stack.pop().equals('[')) {
                        return false;

                    }
                    break;
                case ')':
                    if (stack.empty() || !stack.pop().equals('(')) {
                        return false;

                    }
                    break;
            }
        }

        return stack.empty();
    }

    public static void main(String[] args) {
        boolean op = isBalanced("{()}");
        if (op) {
            System.out.println("balanced");
        } else {
            System.out.println("no");
        }

    }
}


//        Scanner s=new Scanner(System.in);
//        int[] arr= {1, 4, 5, 3, 7, 8, 6};
//        int n=8;
//        int sumOfNumbers=(n*(n+1))/2;
//        int sumOfElements=0;
//
//        for(int i=0;i<arr.length;i++){
//
//            sumOfElements=sumOfElements+arr[i];
//
//        }
//        System.out.println(Arrays.toString(arr));
//        int missingNumber=sumOfNumbers-sumOfElements;
//        System.out.println(missingNumber);

