package interview.GeeksForGeeks;
/*
    A sorted array is rotated at some unknown point, find the minimum element in it.
The following solution assumes that all elements are distinct.
sol complexity- with binary serach is O(Logn)
 */
public class FindElementInSortedRotatedArrayUsingBinarySerach {
    public static void main(String[] args){
       int[] arr= {5, 6, 1, 2, 3, 4};
       int n= arr.length;
       int left=0;
       int right =n-1;
       int mid;
       int min=Integer.MAX_VALUE;
       for(int i=0;i<n;i++){
           mid=(left+right)/2;
           while(left<=right){
               if(arr[mid]<min){

               }

           }
       }
    }

}
