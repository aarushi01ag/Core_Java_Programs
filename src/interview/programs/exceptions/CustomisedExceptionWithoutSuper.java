package interview.programs.exceptions;
class CustomisedException2 extends Exception{
    public CustomisedException2() {super();
    }
}
public class CustomisedExceptionWithoutSuper {
    public static void main(String[] args)throws CustomisedException2{
    try{
       throw new CustomisedException2();
    }
    catch(CustomisedException2 ex){
       System.out.println(ex.getMessage());
    }
    System.out.println("rest of the code");}

}
