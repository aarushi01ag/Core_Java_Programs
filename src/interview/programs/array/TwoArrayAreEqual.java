package interview.programs.array;

public class TwoArrayAreEqual {
    public static void main(String[] args)
    {
        int[] arrayOne = {21, 57, 11, 37, 24};

        int[] arrayTwo = {2, 57, 11, 37, 24};
        boolean equalOrNot=true;

        if(arrayOne.length==arrayTwo.length){
            for(int i=0;i<arrayOne.length;i++){
                if(arrayOne[i]!=arrayTwo[i]){
                    equalOrNot=false;
                }

            }
        }
        if(equalOrNot==true)
        {
            System.out.println("arrays are equal");
        }

        else{
            System.out.println("arrays are not equal");
        }

    }
}
