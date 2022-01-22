package javaTPoint.array;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicatesInarray {
    public static void main(String[] args){
        String[] strArray = {"Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC"};
        for(String words:strArray){
            HashSet<String> stringset=new HashSet<String>();
            if (!stringset.add(words)) {
            System.out.println(words);
            }
        }
    }
}
