package interview.programs.array;

import java.util.Arrays;

/*
absolute value is the modulus of ip i.e. non negative value of x. Complexity is O(nlon)
 */
public class MinimumAbsoluteDifferenceInArrayElementsWithSorting {
    public static void main(String[] args) {
        int[] array={5, -3, 7, -2};
        Arrays.sort(array);
        int min= Math.abs(array[1]-array[0]);
        int first=array[0];
        int second=array[1];
        for(int i=2; i<array.length;i++){
            if(Math.abs(array[i]-array[i-1])<min){
                min=Math.abs(array[i]-array[i-1]);
                first=array[i-1];
                second=array[i];
            }
        }
        System.out.println("Pair of elements:" +first+" "+second);
        System.out.println(min);

    }
}
