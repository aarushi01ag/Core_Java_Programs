package interview.programs.array;
//O(n)
public class ThirdLargestInArray {
    int[] arr= {12, 13,1,10, 34, 16};
    int max=arr[0];
    public  void getThirdLargest(){
    for(int i=1;i<arr.length;i++){
        if(arr[i]>max){
            max=arr[i];
        }
    }
    System.out.println("First max:"+max);

    int secondMax=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>secondMax && arr[i]<max){
            secondMax=arr[i];
        }
    }
    System.out.println("second largest is"+secondMax);
    int thirdLargest=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>thirdLargest && arr[i]<secondMax){
            thirdLargest=arr[i];
        }
    }
    System.out.println("Third Largest"+thirdLargest);
    }
    public static void main(String[] args){
       ThirdLargestInArray obj=new ThirdLargestInArray();
       obj.getThirdLargest();
    }

}
