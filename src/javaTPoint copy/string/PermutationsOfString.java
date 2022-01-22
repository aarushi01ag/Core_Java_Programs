package javaTPoint.string;

public class PermutationsOfString {

    public static String swap(String a, int i, int j) {
        char[] b = a.toCharArray();
        char ch;
        ch = b[i];
        b[i] = b[j];
        b[j] = ch;
        return String.valueOf(ch);
    }

    public static void permutations(String s, int start, int ends) {
        if (start == ends - 1) {
            System.out.println(s);
        } else {
            for (int i = start; i < ends; i++) {
                s = swap(s, start, i);
                permutations(s, start + 1, ends);
                s = swap(s, start, i);
            }
        }


    }

    public static void main(String[] args) {
        String s = "abc";
        int len = s.length();
        permutations(s, 0, len);

    }


}

