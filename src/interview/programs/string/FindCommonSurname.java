package interview.programs.string;

public class FindCommonSurname {
    public static void findSurname(String[] str,String surName){
    int length=str.length;
    int surnameLength=surName.length();
    for(int i=0;i<length;i++){
        int stringLength=str[i].length();
        String subString=str[i].substring(stringLength-surnameLength);
      System.out.println(stringLength-surnameLength);
       System.out.println(subString);
        if(subString.equalsIgnoreCase(surName)){
            System.out.println(str[i]);
        }
    }

    }
    public static void main(String[] args){
        String [] arrayOfNames={
                "Praveen Kumar",
                "Yuvraj Singh",
                "Harbhajan Singh",
                "Gurjit Singh",
                "Virat Kohli",
                "Rohit Sharma",
                "Sandeep Singh",
                "Milkha Singh"
        };
        findSurname(arrayOfNames,"Singh");
    }
}
