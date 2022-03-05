package interviewquestions;

import java.util.*;

public class RemoveStringThatIsAnagramOfEarlier {
    public static void removeAnagram(String[] arr, int n) {
        ArrayList<String> list = new ArrayList<>();
        HashSet<String> hashSet = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];
            word = sort(word);
            if (!hashSet.contains(word)) {
                list.add(arr[i]);
                hashSet.add(word);
            }
        }
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    public static String sort(String word) {
        char[] arr = word.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }

    public static void main(String[] args) {
        String[] arr = {"geeks", "keegs", "code", "doce"};
        int n = arr.length;
        ;
        removeAnagram(arr, n);
    }
}
