package interview.programs.string;

public class FindDistinctPermutations {
    public static void main(String[] args){
        String s="ABA";
        int n=s.length();
        char[] arr=s.toCharArray();
        getPermutations(arr,0,n-1);
    }
    public static char[] swap(char[] arr,int i,int j){
        char ch=arr[i];
        arr[i]=arr[j];
        arr[j]=ch;
        return arr;
    }
    public static boolean checkSwap(char[] arr,int start,int current){
        for(int i=start;i<current;i++){
            if(arr[i]==arr[current]){
                return false;
            }
        }
        return true;
    }
    public static void getPermutations(char[] s,int start,int end){
        if(start>=end){
            System.out.println(s);
        }
        else{
            for(int i=start;i<=end;i++){
                boolean shouldSwal=checkSwap(s,start,i);
                if(shouldSwal){
                    s=swap(s,start,i);
                    getPermutations(s,start+1,end);
                    s=swap(s,start,i);
                }
            }

        }
    }
}
