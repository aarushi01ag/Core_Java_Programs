package javaTPoint.string;

public class StringEndsWithMethod {
    public static void main(String[] args){
        String s1="java is a programming language";
        System.out.println(s1.endsWith("a"));
        System.out.println(s1.endsWith("guage"));

        if(s1.endsWith("language")){
            System.out.println("The  programming language is java");
        }
        else
            System.out.println("false");
    }
}
