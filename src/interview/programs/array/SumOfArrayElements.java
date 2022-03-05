package interview.programs.array;

public class SumOfArrayElements {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 2, 4, 7};
        int sum=0;
        for(int i:arr){
            sum=sum+i;

        }
        System.out.println(sum);
    }
}