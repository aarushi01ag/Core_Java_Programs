package javaTPoint.array;

import java.util.HashMap;

public class DuplicateElementsInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 7, 8, 8, 3};

        HashMap<Integer, Integer> frequency = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {

            if (frequency.get(arr[i]) == null) {
                frequency.put((arr[i]), 1);
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        frequency.replace(arr[i], frequency.get(arr[i]) + 1);
                        if (frequency.get(arr[i]) > 1) {
                            System.out.println(arr[i]);
                        }
                    }
                }


            }
        }
    }
}
