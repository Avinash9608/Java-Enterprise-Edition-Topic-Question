package CollectionExamples;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {
    public static void main(String[] args) {
        Set<String> months=new HashSet<>();
        System.out.println(months.add("Jan"));
        System.out.println( months.add("Feb"));
        System.out.println( months.add("Mar"));
        System.out.println(months.add("Apr"));
        System.out.println( months.add("Feb"));
        System.out.println("Size "+months.size());
        System.out.println(months);
    }
}
