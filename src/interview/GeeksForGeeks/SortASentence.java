package interview.GeeksForGeeks;

public class SortASentence {
    public static String sortSentence(String s){
        String[] str=s.split(" ");
        StringBuilder sb=new StringBuilder();
        String[] res=new String[s.length()];

        for(int i=0;i<str.length;i++){
            int index = (int)(str[i].charAt(str[i].length()-1)-'0')-1;
            res[index]=str[i].substring(0,str[i].length()-1);
        }
        for(int i=0;i<str.length;i++){
            sb.append(res[i]+" ");
        }
        return  sb.toString().substring(0,sb.length()-1);
    }
    public static void main(String[] args){
        String s="is2 sentence4 This1 a3";
       System.out.println(sortSentence(s));
        //sortSentence(s);

    }
}
