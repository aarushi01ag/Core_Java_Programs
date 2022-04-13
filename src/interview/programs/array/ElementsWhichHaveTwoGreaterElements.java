package interview.programs.array;

public class ElementsWhichHaveTwoGreaterElements {
    public static void main(String[] args) {
        int[] arr = {2, 8, 7, 1, 5};
        int first=0;
        int second=0;
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
