package interview.programs.tpoint.programs;

public class IsPrime {
    public static boolean prime() {
    int number=24;
    if(number==0||number==1){
        System.out.println("not prime");
    }
    else{
        for(int i=2;i<Math.sqrt(number);i++){
            int rem=number%i;
            if(rem==0){
                int factor=number/i;
                System.out.println("factors are; "+" "+i+"*"+factor);
                return false;
            }
        }
    }
    return true;
}
    public static void main(String[] args){
        if(prime()){
            System.out.println("prime");
        }
        else{
            System.out.println("not");
        }
    }
}

