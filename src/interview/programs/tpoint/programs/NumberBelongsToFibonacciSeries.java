package interview.programs.tpoint.programs;

public class NumberBelongsToFibonacciSeries {
    public static void main(String[] args){
        int third=0;
        int second=1;
        int first=0;
        int number=2;
        while(third<number){
            third=first+second;
            first=second;
            second=third;
        }
        if(third==number){
            System.out.println("belongs");
        }
        else{
            System.out.println("no");
        }
    }
}
