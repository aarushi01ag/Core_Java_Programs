package interview.programs.array;

public class InstanceVariableOfClass {
    int rk=10;//instance variable
    public static void main(String[] args){
        InstanceVariableOfClass obj=new InstanceVariableOfClass();//class instance
        System.out.println("Instance variable accessed using instance of class");
        System.out.println(obj.rk);
    }
}
