package interview.programs.string;

import java.util.Arrays;

public class ReverseAStringWhilePreservingSpaces {
    public static void main(String[] args){
        String s="I Am Not String";
        char[] inputArray=s.toCharArray();
        char[] resultArray=new char[inputArray.length];
        int j=inputArray.length-1;
        for(int i=0;i< inputArray.length;i++){
            if(inputArray[i]==' '){
                resultArray[i]=' ';
            }
        }
        for(int i=0;i<inputArray.length;i++){
            if(inputArray[i]!=' '){
                if(resultArray[j]==' '){
                    j--;
                }
                resultArray[j]=inputArray[i];
                j--;
            }
        }
        System.out.println(Arrays.toString(resultArray));
    }
}
