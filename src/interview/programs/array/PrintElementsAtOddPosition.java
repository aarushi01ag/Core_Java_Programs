package interview.programs.array;

public class PrintElementsAtOddPosition {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6};
        for(int i=1;i<arr.length;i++){
            System.out.println(arr[i]);
            i=i+1;
        }
    }
}
