package interview.programs.string;

public class ReverseWordsInAString {
   public static String reverseWords(String s) {
        String[] subStringArray =s.split("\\.");
        String reversedString = "";

        for (int i = subStringArray.length - 1; i >= 0; i--) {
            reversedString = reversedString + subStringArray[i];
            if(i!=0){
                reversedString=reversedString+".";
            }
        }

return reversedString;

    }

    public static void main(String[] args) {
        String out=reverseWords("i.like.this.program.very.much");
System.out.println(out);
    }
//if sentence contain space then split by \\sor " "
    /*public static void main(String args[]) {
        String s[] = "you shall not pass".split(" ");
        String ans = "";
        for (int i = s.length - 1; i >= 0; i--) {
            ans += s[i] + " ";
        }
        System.out.println("Reversed String: " + ans);
    }*/
}
