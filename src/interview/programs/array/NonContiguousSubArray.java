package interview.programs.array;

import java.util.HashSet;

public class NonContiguousSubArray {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,7,9};
        int sum=7;
        getSumPairs(arr,sum);
    }
    public static void getSumPairs(int[] arr, int sum){

        HashSet<Integer> hm=new HashSet<>();


        for(int i=0;i<arr.length;i++){
            int pair2=0;

            pair2=sum-arr[i];
            if(hm.contains(pair2)){
                System.out.println(arr[i]+" "+pair2);
            }
            hm.add(arr[i]);



        }
    }
}
