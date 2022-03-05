package interview.programs.array;

public class SmallestElementInArray {
    public static void main(String[] args) {
        int[] arr = {3, 11, 7, 2, 56};
        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }System.out.println(smallest);
    }
}