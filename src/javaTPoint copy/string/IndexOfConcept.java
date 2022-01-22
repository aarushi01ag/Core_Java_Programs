package javaTPoint.string;

public class IndexOfConcept {

    String s1=new String("Java is a programming language");

    public static void main(String[] args){
        IndexOfConcept obj=new IndexOfConcept();
        int index1 =  obj.s1.indexOf('a');
        System.out.println("index1 is :" +index1);

        int index2 = obj.s1.indexOf("is");
        System.out.println(index2);

        int index3= obj.s1.indexOf('a',5);
        System.out.println(index3);

        int index4=obj.s1.indexOf("ng",6);
        System.out.println(index4);

        int index5=obj.s1.indexOf('k');
        System.out.println(index5);

        int index6 = obj.s1.lastIndexOf("is");
        System.out.println(index6);
        System.out.println(obj.s1.startsWith("J"));
        String replaceString=obj.s1.replaceAll("\\s","");
        System.out.println(replaceString);

        String s1="welcome to split world";System.out.println("returning words:");
        for(String w:s1.split("\\s",1)) {
            System.out.println(w);


        }}
}
