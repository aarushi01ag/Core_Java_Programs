package interview.programs.tpoint.programs;

public class ArmstrongNumber2 {
    public void isArmstrong(int number){
        int noOfDigits=String.valueOf(number).length();
        int lastDigitToThePowerOfLastDigit=1;
        int sum=0;
        int lastDigit=0;
        int temp=number;
        while (temp!=0){
            lastDigit=temp%10;
            for(int i=0;i<noOfDigits;i++){
                lastDigitToThePowerOfLastDigit=lastDigitToThePowerOfLastDigit*lastDigit;
            }
            sum=sum+lastDigitToThePowerOfLastDigit;
            temp=temp/10;
        }
        if(sum==number){
            System.out.println("Yes armstrong");
        }
        else {
            System.out.println("not armstrong");
        }
    }
    public static void main(String[] args){
        ArmstrongNumber2 obj=new ArmstrongNumber2();
        obj.isArmstrong(153);
    }

}
