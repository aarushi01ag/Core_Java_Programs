package interview.programs.array;

public class ThreeLargestElements {
    public static void main(String[] args){
        int arr[] = { 12, 13, 1, 10, 34, 1 };
        int first,second,third;
        //first=second=third  =Integer.MAX_VALUE;
        first=Integer.MAX_VALUE;
        second=Integer.MAX_VALUE;
        third=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<first){
                third=second;
                second=first;
                first=arr[i];
            }
            else if(arr[i]<second){
               third= second;
               second=arr[i];
            }
            else if(arr[i]<third){
                third=arr[i];
            }
        }
        System.out.println(first+" "+second+" "+third);
    }
}
