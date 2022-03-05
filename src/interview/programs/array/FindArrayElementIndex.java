package interview.programs.array;

public class FindArrayElementIndex {
    public static int findPosition(){
        int[] array={2, 4, 6, 8, 10, 12, 14, 16};
        int start=0;
        int end=array.length-1;
        int key=14;
        int mid=0;
        while(start<=end){
            mid=(start+end)/2;
            if(key==array[mid]){
                return mid;
            }
            else if(key<array[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int output=findPosition();
        System.out.println(output);


    }
}
