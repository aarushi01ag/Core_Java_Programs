package interview.programs.string;

public class StringContainsMethod {
    String s1 = "Java is a";
    String s2 = "programming language";
    String s3 = "based on OOPS";


    public static void main(String args[])throws Exception{
        StringConcatMethod stringConcatObj=new StringConcatMethod();


        System.out.println(stringConcatObj.s1.contains("is"));
        System.out.println(stringConcatObj.s1.contains("Is"));   //case sensitive so gives false
        if(stringConcatObj.s1.toLowerCase().contains("java")){  //checking condition using contains
            System.out.println(stringConcatObj.s1.concat(" ").concat(stringConcatObj.s2));
        }
        else{
            System.out.println("condition failed");
        }

    }
}
