package interview.programs.array;

public class LargestElementInArray {
    public static void main(String[] args) {
        int[] arr = {100, 11, 87, 5, 56};
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
                if (largest < arr[i]) {
                    largest = arr[i];
                }

        }
        System.out.println(largest);
    }
}
