package interview.programs.array;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicatesInarray {
    public static void main(String[] args) {
        HashSet<String> stringset = new HashSet<String>();
        String[] strArray = {"Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC"};
        for (String words : strArray) {

            if (!stringset.add(words)) {
               System.out.println(words);
            }
        }

    }
}
