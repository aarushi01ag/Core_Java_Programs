package interview.programs.string;

public class PalindromeOfString {
    public static void main(String[] args){
        String s="KAYAk";
        int len=s.length();
        int midPoint=len/2;
        boolean flag=true;
        for(int i=0;i<midPoint;i++){
        if(s.charAt(i)!=s.charAt(s.length()-i-1)){
            flag=false;
            break;
        }

        }
        if(flag){System.out.println("palindrom");}
        else{System.out.println("Not palindrome");}

    }
}
