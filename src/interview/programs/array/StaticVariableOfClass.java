package interview.programs.array;
public class StaticVariableOfClass {
    // static variable
    int a = 10;
    // static block
    static
    {
        System.out.println("Inside static block");
    }
    // static method
    static int m1()
    {System.out.println("from m1");
        return 20;
    }
    // static method(main !!)
    public static void main(String[] args)
    { StaticVariableOfClass obj1=new StaticVariableOfClass();
        System.out.println("Value of a : " + obj1.a);
        System.out.println("from main");
        m1();





    }
}
