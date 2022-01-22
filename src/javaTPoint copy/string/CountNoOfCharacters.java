package javaTPoint.string;

public class CountNoOfCharacters {


    public static void main(String[] args) {
        String s = "Good Morning! Mr. James Potter. Had your breakfast?";
        int characterCount = 0;
        int punctuationCount = 0;
        int vowvelCount=0;
        int consonantsCount=0;
        s=s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                characterCount++;


                if (s.charAt(i) == '!' || s.charAt(i) == '.' || s.charAt(i) == ',' || s.charAt(i) == '-' || s.charAt(i) == ';' ||
                        s.charAt(i) == '?' || s.charAt(i) == '"') {
                    punctuationCount++;
                }
                else if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                    vowvelCount++;}

                else if(s.charAt(i) >= 'a' && s.charAt(i)<='z'){
                        consonantsCount++;
                    }
                }}


        System.out.println("No of characters are:- " + characterCount);
        System.out.println("No of punctuations are:- " + punctuationCount);
        System.out.println("No of vowels are:- "+vowvelCount);
        System.out.println("No of consonants are:- "+consonantsCount);
    }
}
