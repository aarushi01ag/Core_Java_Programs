package javaTPoint.string;

public class FindLeaders {
    /**
     * Write a program to print all the LEADERS in the array. An element is leader if it is greater than all the elements to its right side.
     * And the rightmost element is always a leader. For example int the array {16, 17, 4, 3, 5, 2}, leaders are 17, 5 and 2.
     * @param array
     * @param n
     *
  an element is leader if element s to left are smaller {2,5,3,4,17,16}
     */


    public static void findLeaders(int[] array, int n){
        int max=array[n-1];
        System.out.println("leaders are: "+max);

        for(int i=n-2;i>=0;i--){
            if(array[i]>max){
                max=array[i];
                System.out.println(max);
            }
        }


    }

    public static void findLeader2(int[] array,int n){
        int max=array[0];
        System.out.println("leader are:"+max);
        for(int i=1;i<n;i++){
            if(array[i]>max){
                max=array[i];
                System.out.println(max);
            }
        }
    }

    public static void main(String[] args){
        int[] arr1={16, 17, 4, 3, 5, 2};
        int[] arr2={2,5,3,4,17,16};
        int n=arr1.length;
        findLeaders(arr1,n);
        System.out.println();
        findLeader2(arr2,n);

    }

    //{0,0,0,0}
    //{null}
    //single element
    //sorted array
    //array of same values
    //



}
