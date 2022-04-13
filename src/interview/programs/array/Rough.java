package interview.programs.array;

import java.util.*;


public class Rough {

    public static int getRow(int n) {
        int[] nums = new int[n + 1];
        nums[0] = 0;
        nums[1] = 1;
        int max = 0;
        if (n < 2) {
            return n;

        }

        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                nums[i] = nums[i / 2];
            } else {
                nums[i] = nums[i / 2] + nums[(i / 2) + 1];
            }
            max = Math.max(max, nums[i]);

        }
        System.out.println(Arrays.toString(nums));
        return max;
    }

    public static void main(String[] args) {
        System.out.println(getRow(7));
    }
}
