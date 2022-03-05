package interview.programs.array;

public class ReverseAndAddForPalindrome {
    public static int getReversal(int num) {
        int temp = num;
        int lastDigit;

        int reversal = 0;
        while (temp != 0) {
            lastDigit = temp % 10;
            reversal = (reversal * 10) + lastDigit;
            temp = temp / 10;
        }
        return reversal;
    }

    public static boolean checkPalindrome(int num) {
        int reversal = getReversal(num);
        if (reversal == num) {
            return true;
        } else {
            return false;
        }
    }

    public static void reverseAndAdd(int num) {
        if(checkPalindrome(num)){
            System.out.println("number is already palindrome");
        }
        else{
            while(!checkPalindrome(num)){
                int reversed=getReversal(num);
                int sum=reversed+num;
                System.out.println(sum);
                num=sum;
            }
        }
    }

    public static void main(String[] args) {
        int number = 7325;
       reverseAndAdd(number);


    }
}
