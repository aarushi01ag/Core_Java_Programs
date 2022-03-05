package interview.GeeksForGeeks;
/*
Find the no of times a sorted array is right rotated
{7, 9, 11, 12, 5} o/p=4
Solution is find minimum element and then its index is no of rotations
 */
public class FindRotationCount {
    public static void main(String[] args){
    int[] array={7, 9, 11, 12, 5};
    int n= array.length;;
    int minValue=Integer.MAX_VALUE;
    int minIndex=0;
    for(int i=0;i<n;i++){
        if(minValue>array[i]){
            minValue=array[i];
            minIndex=i;
        }
    }
    System.out.println("No of rotations are"+ (minIndex));

    }
}
