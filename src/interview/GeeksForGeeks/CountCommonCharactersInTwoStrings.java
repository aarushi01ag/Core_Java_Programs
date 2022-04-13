package interview.GeeksForGeeks;

public class CountCommonCharactersInTwoStrings {
    public static void main(String[] args){
        String s1="abcd";
        String s2="aad";
        int[] freq1=new int[26];
        int[] freq2=new int[26];
       for(int i=0;i<s1.length();i++){
           freq1[s1.charAt(i)-'a']+=1;
       }
        for(int i=0;i<s2.length();i++){
            freq2[s2.charAt(i)-'a']+=1;
        }
        int i,count=0;
        for( i=0;i<26;i++){
            count+=Math.min(freq1[i],freq2[i]);

        }
        System.out.println(count);
    }
}
