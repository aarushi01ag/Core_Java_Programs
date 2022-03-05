package interview.programs.array;

public class ParameterisedConstructor {
    String color;
    ParameterisedConstructor(String carColor){
        color=carColor;
        System.out.println("hello java");
    }
    public static void main(String[] args){
        ParameterisedConstructor obj=new ParameterisedConstructor("red");
        System.out.println(obj.color);
    }
}
