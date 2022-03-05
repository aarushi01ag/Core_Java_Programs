package interview.programs.string;

public class ReversingAString {


    public static void reverseUsingBufferClass() {
        String s = "java is a programming language";
        StringBuffer input = new StringBuffer(s);

        input.reverse();

            System.out.println(input);

    }
    public static void reverseUsingArrays(){
        String s="java is a programming language";
                char[] input=s.toCharArray();
                for(int i=input.length-1;i>=0;i--){

                    System.out.println(input[i]);
                }
    }

    public static void main(String[] args){
        reverseUsingArrays();
        reverseUsingBufferClass();
    }
}
