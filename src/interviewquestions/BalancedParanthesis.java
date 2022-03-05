package interviewquestions;

import java.util.Stack;
/*
A bracket is balanced if closed by same type of bracket and in correct order.
Can we solve this with the help of stack DS LIFO.
logic: traverse the stack and push all opening brackets in stack. Now if any closing bracket is there
and its opening bracket is found on top of stack then pop it.
Once stack is empty means string is balanced and return empty stack.
 */
public class BalancedParanthesis {
    public static String getBalancedString(String s) {
        Stack<Character> stack = new Stack<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else if (s.charAt(i) == ')' || !stack.isEmpty() || stack.peek() == '(') {
                stack.pop();
            } else if (s.charAt(i) == '}' || !stack.isEmpty() || stack.peek() == '{') {
                stack.pop();
            } else if (s.charAt(i) == ']' || !stack.isEmpty() || stack.peek() == '[') {
                stack.pop();
            } else {
                System.out.println("false");
            }
        }
        return String.valueOf(stack.empty());
    }

    public static void main(String[] args) {
        String s = "{()}";
        System.out.println(getBalancedString(s));
    }
}
