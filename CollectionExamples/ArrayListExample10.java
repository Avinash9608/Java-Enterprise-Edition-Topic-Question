package CollectionExamples;

import java.util.*;

public class ArrayListExample10 {
    public static void main(String[] args) {
        List<String> months=new ArrayList<>();
        months.add("Jan");
        months.add("Feb");
        months.add("Mar");
        months.add("Apr");
        Iterator<String> it=months.iterator();
        while(it.hasNext())
        {
            String str=it.next();
            System.out.println(str);
        }
    }
}
