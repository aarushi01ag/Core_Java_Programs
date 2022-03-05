package interview.programs.string;

public class PercentageOfUpperCaseLowerCaseSpecialDigitsInString {
    public static void main(String[] args){
        String s="Tiger Runs @ The Speed Of 100 km/hour.";

        int upperCaseCount=0;
        int lowerCaseCount=0,specialCount=0,digitCount=0;
        double upperCasePercent=0;
        double lowerCaseCountPercent=0,specialCountPercent=0,digitCountPercent=0;
        int total=s.length();
        for(int i=0;i<total;i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){digitCount++;}
            else if(Character.isUpperCase(ch)){upperCaseCount++;}
            else if(Character.isLowerCase(ch)){lowerCaseCount++;}
            else{
                specialCount++;
            }
        }
        upperCasePercent=(upperCaseCount*100.0)/total;
        System.out.println(upperCasePercent);
        lowerCaseCountPercent=(lowerCaseCount*100.0)/total;
        digitCountPercent=(digitCount*100.0)/total;
        specialCountPercent=(specialCount*100.0)/total;
        System.out.println(lowerCaseCountPercent+" "+digitCountPercent+" "+specialCountPercent);


    }

}
