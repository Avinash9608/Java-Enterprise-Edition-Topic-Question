package CollectionExamples;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample3 {
    public static void main(String[] args) {
        Set<String> months=new HashSet<>();
        months.add("Jan");
        months.add("Feb");
        months.add("Mar");
        months.add("Apr");
        for(String str:months)
        System.out.println(str);
    }
}
// here we don't use the for loop becase Hashset has not indexof method