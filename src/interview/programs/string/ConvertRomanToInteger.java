package interview.programs.string;

import java.util.HashMap;

public class ConvertRomanToInteger {
    public static void main(String[] args) {
        HashMap<Character, Integer> hp = new HashMap<>();
        hp.put('I', 1);
        hp.put('V', 5);
        hp.put('X', 10);
        hp.put('L', 50);
        hp.put('C', 100);
        hp.put('D', 500);
        hp.put('M', 1000);
        int num = 0;
        int curr = 0;
        int next = 0;
        String s = "MCMXCIV";
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            if ((i < s.length() - 1) && (hp.get(c)<hp.get(s.charAt(i+1)))) {
                num+= hp.get(s.charAt(i+1))-hp.get(c);
                i++;
            } else {
                num = num + hp.get(c);
            }
        }
        System.out.println(num);


    }
}
