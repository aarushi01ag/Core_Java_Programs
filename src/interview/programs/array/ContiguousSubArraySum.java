
package interview.programs.array;

public class ContiguousSubArraySum {
    public static void main(String[] args){
        int[] arr={1, -2,-1, 0, -4, 1};
        int inputSum=-2;
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
                    System.out.println(" contiguous sub array is: "+arr[j]);
                }
            }
        }
    }
}

