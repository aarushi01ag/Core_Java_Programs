package interview.programs.tpoint.programs;

/*Write a Java program or function which checks whether given number is Disarium number or not.
Your program should take input number from the user.Also write Java programs to find first n Disarium
numbers and Disarium numbers between two given numbers.

Sol: A number is said to be Disarium if it is equal to sum of its digits raised
to the power of their respective position in the number
 */
public class DisariumNumber {
    public static void main(String[] args) {
        int[] arr = {135, 578, 122};
        for (int i : arr) {
            int len = String.valueOf(i).length();
            int temp = i;
            int sum = 0;
            while (temp > 0) {
                int lastDigit = temp % 10;

                sum = sum + (int) Math.pow(lastDigit, len);
                temp = temp / 10;
                len--;

            }
            if (sum == i) {
                System.out.println("number is disarium");
            } else {
                System.out.println("not disarium");
            }
        }
    }
}
