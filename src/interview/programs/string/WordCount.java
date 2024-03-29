package interview.programs.string;

public class WordCount {


        public static void main(String[] args) {
            String sentence = "Beauty lies in the eyes of beholder";
            int wordCount = 0;
System.out.println(sentence.length());
            for(int i = 0; i < sentence.length(); i++) {
                //Counts all the spaces present in the string
                //It doesn't include the first space as it won't be considered as a word
                if(sentence.charAt(i) == ' ' && Character.isLetter(sentence.charAt(i+1)) && (i > 0)) {
                    wordCount++;
                }
            }
            //To count the last word present in the string, increment wordCount by 1
            wordCount++;

            //Displays the total number of words present in the given string
            System.out.println("Total number of words in the given string: " + wordCount);
        }

}
