package interview.programs.tpoint.programs;

public class FindNearestPalindrome {
    public static String nearestPalindromic(String n) {
        Integer num=Integer.valueOf(n);
        Integer leftNum=num-1;
        while(checkPalindrome(String.valueOf(leftNum))==false){
            leftNum--;
        }
        Integer rightNum=num+1;
        while(checkPalindrome(String.valueOf(rightNum))==false){
            rightNum++;
        }
        if(Math.abs(num-rightNum)<Math.abs(num-leftNum)){
            return String.valueOf(rightNum);
        }
        else{
            return String.valueOf(leftNum);
        }
    }
    public static boolean checkPalindrome(String num){
        int n=num.length();
        int i=0;
        int j=n-1;
        while(i<j){
            if(num.charAt(i)!=num.charAt(j)){
                return false;

            }else{
                i++;
                j--;

            }}
        return true;
    }
    public static void main(String[] args){
        String s="123";
        System.out.println(nearestPalindromic(s));

    }
}
