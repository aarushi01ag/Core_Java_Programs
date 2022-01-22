package javaTPoint.array;

public class FindMaxAndMin {
    public static void main(String[] args){
        int arr[]={25, 11, 7, 75, 56};
        int largest=arr[0];
        int smallest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                largest=arr[i];
            }
            else if(smallest>arr[i]){
                smallest=arr[i];
            }

        }
        System.out.println(smallest+ " "+ largest);
    }
}
