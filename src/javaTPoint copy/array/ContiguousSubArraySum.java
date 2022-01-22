/*
package javaTPoint.array;

public class ContiguousSubArraySum {
    public static void main(String[] args){
        int[] arr={42, 15, 12, 8, 6, 32};
        int inputSum=26;
        int start=0;
        int sum=arr[0];
        for(int i=1;i<arr.length;i++){
            sum=sum+arr[i];
            while((sum>inputSum)&&(start<=i-1)){
                sum=sum-arr[start];
                start++;
            }
            if(sum==inputSum){
                for(int j=start;j<=i;j++){
                    System.out.println("contiguous sub array is: "+arr[j]+"and index is: "+j);
                }
            }
        }
    }
}
*/
