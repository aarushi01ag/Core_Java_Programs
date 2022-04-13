package interview.GeeksForGeeks;

public class UnCommonCharactersOfTwoStrings {
    public static void main(String[] args) {
        String s1 = "characters";
        String s2 = "alphabets";
        int[] freq = new int[26];
        for (int i = 0; i < s1.length();i++){
            freq[s1.charAt(i)-'a']=1;
        }
        for(int i=0;i<s2.length();i++){
            if(freq[s2.charAt(i)-'a']==1 || freq[s2.charAt(i)-'a']==-1){
                freq[s2.charAt(i)-'a']=-1;
            }
            else {
                freq[s2.charAt(i)-'a']=2;
            }
        }
        for(int i=0;i<26;i++){
            if(freq[i]==1 || freq[i]==2){
                System.out.println((char)(i+'a'));
            }
        }
    }
}