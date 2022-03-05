package interview.programs.string;

public class StringConcatMethod {

    String s1 = "Java is a";
    String s2 = "programming language";
    String s3 = "based on OOPS";

    public void concatString() {
        System.out.println(s1.concat(s2));
        //concat multiple strings;

        System.out.println(s1.concat(" ").concat(s2).concat(" ").concat(s3));
    }

    public static void main(String[] args) {
        StringConcatMethod concatStringObj = new StringConcatMethod();
        concatStringObj.concatString();
    }
}
