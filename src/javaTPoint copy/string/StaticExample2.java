package javaTPoint.string;

public class StaticExample2 {

    int count = 0;

    // Driver code
    public static void main(String args[])
    {

        // Accessing static variable
        // by creating an instance
        // of the class
        StaticExample2 test = new StaticExample2();

        test.count++;
        System.out.println(test.count);
    }
}


