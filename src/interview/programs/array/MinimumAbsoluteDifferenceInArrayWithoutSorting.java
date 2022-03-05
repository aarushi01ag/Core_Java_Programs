package interview.programs.array;
/*
Sorting-O(n^2)
 */
public class MinimumAbsoluteDifferenceInArrayWithoutSorting {
    public static void main(String[] args){
        int[] arr={5, 8, 4, 2, 9, 0};
        int min=Integer.MAX_VALUE;
        int first=arr[0];
        int second=arr[1];
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(Math.abs(arr[i]-arr[j])<min){
                    min=Math.abs(arr[i]-arr[j]);
                    first=arr[i];
                    second=arr[j];
                    }
                }
            }
        System.out.println("Pair of elements "+first+ " "+ second);
        System.out.println(min);
        }

    }

