package interview.programs.string;

public class StringGetChar {

public static void main(String[] args){
    String s2="Hello jav ";
    String s1=new String(s2);
    char[] ch=new char[10];
    s1.getChars(1,9,ch,2);
System.out.println(ch);

}}
