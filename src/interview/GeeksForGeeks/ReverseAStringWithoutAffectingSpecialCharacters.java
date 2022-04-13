package interview.GeeksForGeeks;

import java.util.Arrays;

public class ReverseAStringWithoutAffectingSpecialCharacters {
    public static void main(String[] args) {
        String s = "a,b$c";
        char[] arr = s.toCharArray();
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            if (!Character.isAlphabetic(arr[l])) {
                l++;
            } else if (!Character.isAlphabetic(arr[r])) {
                r--;
            } else {
                char temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;

            }
        }
        System.out.println(new String(arr));
    }
}
