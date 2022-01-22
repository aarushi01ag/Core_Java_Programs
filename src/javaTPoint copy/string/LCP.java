package javaTPoint.string;

public class LCP {
    public static String lcp(String s, String t){
        int n=Math.min(s.length(), t.length());
        for(int i=0;i<n;i++){
            if(s.charAt(i)!=t.charAt(i)){
                return s.substring(0,i);
            }
        }
        return s.substring(0,n);
    }

    public static void main(String[] args){
        String lrs="";
        String s="acbdfghybdf";
        int n=s.length();

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                String x=lcp(s.substring(i,n),s.substring(j,n));
                if(x.length()>lrs.length()){
                    lrs=x;
                    System.out.println(lrs);
                }
            }
        }
    }
}
