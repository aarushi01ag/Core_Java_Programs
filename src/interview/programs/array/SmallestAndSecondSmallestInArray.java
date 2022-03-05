package interview.programs.array;

public class SmallestAndSecondSmallestInArray {
    public static void main(String[] args){
        int arr[]={17, 11, 23, 64, 41, 88, 35};
        int smallest=arr[0];
        int secondSmallest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                secondSmallest=smallest;
                smallest=arr[i];

            }
            else if(arr[i]<secondSmallest){
                secondSmallest=arr[i];
            }
        }
        System.out.println(secondSmallest);
    }
}
