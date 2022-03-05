package interview.programs.array;
/*
Kadane’s algorithm solves maximum sub array problem in linear time i.e O(n). According to Kadane’s algorithm,
we maintain two sums. One is bestSum and another one is currentSum. We go on adding each element of inputArray
to currentSum. If currentSum becomes smaller than 0 (It happens when there are negative numbers), we clear
currentSum and start fresh from next element. If currentSum exceeds bestSum, currentSum is assigned to bestSum.
If currentSum is neither smaller than 0 nor greater than bestSum, continue adding next element to currentSum.
Let’s see this process step by step.
 */
public class ContiguousSubArrayWithMaximumSum {
    public static void getMaximumSumContiguousSubArray(int[] arr){
        int bestSum=arr[0];
        int bestStart=0;
        int bestEnd=0;
        int currentSum=0;
        int currentStart=0;
        for(int i=0;i<arr.length;i++){
            currentSum=currentSum+arr[i];
            if(currentSum<0){
                currentSum=0;
                currentStart=i+1;
            }
            else if(currentSum>bestSum){
                bestSum=currentSum;
                bestStart=currentStart;
                bestEnd=i;
            }
        }
        printArray(arr,bestStart,bestEnd, bestSum);
    }
    public static void printArray(int[] arr, int start, int end, int bestSum){
        System.out.print("[");
        for(int i=start;i<=end;i++){
        System.out.print(" "+arr[i]);}
        System.out.print("]");
        System.out.println("\n best sum is:"+bestSum);
    }
    public static void main(String[] args){
        int[] arr={2, -3, 7, -4, 2, 5, -8, 6, -1};
        getMaximumSumContiguousSubArray(arr);
    }
}
