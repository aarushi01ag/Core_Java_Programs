package interview.programs.string;

public class FindStringSubsets {
    public static void main(String[] args) {
        String s = "AARU";
        int temp=0;
        int len = s.length();
        int noOfSubStrings = (len * (len + 1)) / 2;
        String[] arrayOfsubString = new String[noOfSubStrings];
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                String subString = s.substring(i, j + 1);
                arrayOfsubString[temp] = subString;
                temp++;

            }
        }
        for (String output : arrayOfsubString) {
            System.out.println(output);
        }
    }
}
