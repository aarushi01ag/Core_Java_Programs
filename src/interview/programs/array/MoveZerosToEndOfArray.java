package interview.programs.array;

import java.util.Arrays;

public class MoveZerosToEndOfArray {
    int counter = 0;

    public static void main(String[] args) {
        int[] array = {12, 0, -7, 0, 8, 0, 3};
        System.out.println(Arrays.toString(array));
        MoveZerosToEndOfArray obj = new MoveZerosToEndOfArray();
        obj.removeZeros(array);
    }

    public void removeZeros(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                array[counter] = array[i];
                counter++;
            }

        }
        System.out.println(counter);
        while (counter < array.length) {
            array[counter] = 0;
            counter++;
        }
        System.out.println(Arrays.toString(array));

    }
}

