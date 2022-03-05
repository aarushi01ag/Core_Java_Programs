package interview.programs.string;

public class CompareToMethod {
    String s1 = "hello";
    String s2 = "aarushi";
    String s3 = "";

    public void compareToString() {

        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s1));

    }

    public void compareToEmptyString() {
        System.out.println("output is" +s1.compareTo(s3));
        System.out.println(s3.compareTo(s1));

    }

    public static void main(String[] args) {
        CompareToMethod compareToEmptyStringObj = new CompareToMethod();
        compareToEmptyStringObj.compareToEmptyString();

        CompareToMethod compareToStringObj = new CompareToMethod();
        compareToEmptyStringObj.compareToString();
    }
}
