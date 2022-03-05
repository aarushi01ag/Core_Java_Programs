package interview.programs.array;

public class ElementsWhichHaveTwoGreaterElements {
    public static void main(String[] args) {
        int[] arr = {2, 8, 7, 1, 5};
        int first=Integer.MIN_VALUE;
        int second=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>first){
                second=first;
                first=arr[i];
            }
            else if(arr[i]>second){

                second=arr[i];

            }

        }
        for(int i=0;i< arr.length;i++){
            if(arr[i]<second){
                System.out.println(arr[i]+"  ");
            }
        }
    }
}
