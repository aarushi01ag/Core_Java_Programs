package interview.programs.exceptions;
/*
in this we are calling parent class constructor using super() method.
 */
class InvalidAgeException extends Exception{
    public InvalidAgeException(String message) {
        super(message);
    }
}
public class CustomisedException {
    public void invalidAge(int age)throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("age is invalid");
        }
        else{
            System.out.println("age is valid");
        }
    }
    public static void main(String[] args){
        CustomisedException se=new CustomisedException();
       try{se.invalidAge(13);}
       catch (InvalidAgeException ex){System.out.println("exception is thrown");
       System.out.println(ex);}
       System.out.println("rest of the flow");

    }

}
