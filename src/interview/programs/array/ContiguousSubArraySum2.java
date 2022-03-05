package interview.programs.array;

import java.util.HashMap;

//using hashing we can handle both positive and negative number test case
public class ContiguousSubArraySum2 {
    public static void getContiguousSubArray(int[] array, int sum) {
        HashMap<Integer, Integer> hp = new HashMap<>();
        int currentSum = 0;
        hp.put(0,-1);
        for (int i = 0; i < array.length; i++) {
            currentSum = currentSum + array[i];
            if (hp.containsKey(currentSum - sum)) {
                printArray(array, hp.get(currentSum - sum) + 1, i);
            }
            hp.put(currentSum, i);
        }
    }

    public static void printArray(int[] array, int start, int end) {
        System.out.print("[");
        for (int j = start; j <= end; j++) {
            System.out.print(" "+array[j]+" ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] array = {2,4,2,8,3,3,2,-4,12};
        int sum = 8;
        getContiguousSubArray(array, sum);
    }
}
