package interview.programs.array;

public class LargestNumberLessThanGivenNumberAndWithoutGivenDigit {
    public static void main(String[] args){
        int number=145;
        int digit=4;
        char d=Integer.toString(digit).charAt(0);
        for(int i=number-1;i>0;i--){
            if(Integer.toString(i).indexOf(d)==-1){
                System.out.println(i);
                break;
            }

        }


    }
}
