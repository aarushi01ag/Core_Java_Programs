package interview.programs.string;


import java.util.Arrays;

public class Test {

    public void rightRotate(int[] arr, int n) {

        int len=arr.length;
        for (int i=1;i<=n;i++) {
            int temp=arr[len-1];
            int j;
            for(j=len-1;j>0;j--){
                arr[j]=arr[j-1];
            }
            arr[0]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int n = 3;
        Test t = new Test();
        t.rightRotate(arr, n);
    }
}
