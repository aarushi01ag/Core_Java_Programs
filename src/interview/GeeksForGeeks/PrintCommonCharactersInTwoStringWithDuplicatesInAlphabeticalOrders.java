package interview.GeeksForGeeks;

/*
Input :
string1 : geeks
string2 : forgeeks
Output : eegks
Explanation: The letters that are common between
the two strings are e(2 times), k(1 time) and
s(1 time).
Hence the lexicographical output is "eegks"
 */
public class PrintCommonCharactersInTwoStringWithDuplicatesInAlphabeticalOrders {
    public static void main(String[] args){
        String s1="geeks";
        String s2="forgeeks";
        int maxChars=26;
        //creating a array containing frequency of elements in string in alphabetical order
        int[] a1=new int[maxChars];
        int[] a2=new int[maxChars];
        for(int i=0;i<s1.length();i++){
            a1[s1.charAt(i)-'a']+=1;  //here  we are calculating the frequency a[6]=a[6]+1;

        }
        for(int i=0;i<s2.length();i++){
            a2[s2.charAt(i)-'a']+=1;
        }

        for(int i=0;i<maxChars;i++){
            if(a1[i]!=0 && a2[i]!=0){
                for(int j=0;j<Math.min(a1[i],a2[i]);j++){
                    System.out.println((char) (i+'a')); //this is usedd for priniting the alphabets
                }
            }

        }


    }
}
