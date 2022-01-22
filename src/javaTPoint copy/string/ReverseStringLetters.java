package javaTPoint.string;

public class ReverseStringLetters {
    public void reverseLetters(String s) {
        String[] subStringArray = s.split(" ");
        String reversedString = "";

        for (int i = 0; i < subStringArray.length; i++) {
            String words = subStringArray[i];
            String reversedWord = "";
            for (int j = words.length() - 1; j >= 0; j--) {
                reversedWord = reversedWord + words.charAt(j);
            }
            System.out.println(reversedWord);
            reversedString = reversedString + reversedWord + " ";
        }
        System.out.println(reversedString);
    }

    public static void main(String[] args){
        ReverseStringLetters obj =new ReverseStringLetters();
        obj.reverseLetters("welcome to home");
        //obj.reverseLetters("The programming language is java");

    }
}
