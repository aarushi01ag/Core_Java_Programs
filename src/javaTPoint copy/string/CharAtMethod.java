package javaTPoint.string;

import java.util.HashMap;

public class CharAtMethod {
    int length = 0;
    String s2 = "Java is a programming language";

    public void charAtSpecificIndex() {
        String s1 = "Welcome";

        length = s1.length();
        System.out.println(s1.charAt(2));
        System.out.println("Character at 0 index is: " + s1.charAt(0));
        System.out.println("Character at last index is: " + s1.charAt(length - 1));

        //logic to find elements at odd index
        for (int i = 0; i <= length - 1; i++) {
            if (i % 2 != 0) {
                System.out.println("Character at odd index is: " + s1.charAt(i));
            }
        }

    }

    public void countFrequencyOfElements() {


        char string[] = s2.toCharArray();
        length = s2.length(); //converted string to array
        int[] frequency = new int[length];   //array
        HashMap<Character, Integer> output = new HashMap<Character, Integer>();
        int i, j;


        for (i = 0; i < length; i++) {
            if (output.get(s2.charAt(i)) == null) {
                output.put(s2.charAt(i), 1);


                for (j = i + 1; j < length; j++) {
                    if (string[i] == string[j]) {
                        frequency[i]++;
                        string[j] = '0';

                        output.replace(s2.charAt(i), output.get(s2.charAt(i) + 1));
                    }

                }
            }
        }

        System.out.println("character  ||   frequency");
        for (i = 0; i < frequency.length; i++) {
            if (string[i] != '0' && string[i] != ' ') {

                System.out.println(string[i] + "  " + frequency[i]);

            }
        }

    }

    public void countFrequencyOfSpecificElement() {



    }

    public static void main(String[] args) {
        CharAtMethod charAtSpecificIndexOfString = new CharAtMethod();
        charAtSpecificIndexOfString.charAtSpecificIndex();

        CharAtMethod frequency = new CharAtMethod();
        frequency.countFrequencyOfElements();
    }
}
