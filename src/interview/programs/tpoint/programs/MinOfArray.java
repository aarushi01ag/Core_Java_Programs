package interview.programs.tpoint.programs;

public class MinOfArray {
    public static void minElement(int[] arr) {
        int minElement = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (minElement > arr[i]) {
            minElement=arr[i];

            }
        }
        System.out.println(minElement);
    }

    public static void main(String[] args) {
        int[] arr = {22, 12, 34, 7, 4};
        minElement(arr);

    }
}
