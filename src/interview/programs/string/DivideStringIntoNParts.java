package interview.programs.string;

public class DivideStringIntoNParts {
    public static void main(String[] args){
    String s="aaaabbbbcccc";
    int len=s.length();
    int n=3;
    int chars=len/n;
    int temp=0;
    String[] arrayOfSubStrings=new String[n];

    if(len%n!=0){
        System.out.println("String can't be divided int" +n + "parts");
    }
    for(int i=0; i<len;i=i+chars)
    {
        String parts= s.substring(i,i+chars);
        arrayOfSubStrings[temp]=parts;
        temp++;
    }

    for(String output:arrayOfSubStrings){
        System.out.println(output);
    }
    }

}
