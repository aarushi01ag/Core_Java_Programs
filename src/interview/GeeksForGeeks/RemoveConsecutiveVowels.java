package interview.GeeksForGeeks;

public class RemoveConsecutiveVowels {
    static boolean checkVowel(char c){
        return (c=='a') ||(c=='e')||(c=='i')||(c=='o')||(c=='u');
    }
    public static void main(String[] args){
        String s1="geeks for geeks";
        System.out.print(s1.charAt(0)+" ");
        for(int i=1;i<s1.length();i++){
            if(!checkVowel(s1.charAt(i-1)) || !checkVowel(s1.charAt(i))){
                System.out.print(s1.charAt(i)+" ");
            }
        }

    }
}
