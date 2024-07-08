package CollectionExamples;

import java.util.HashSet;

public class HashCodeDemo {
    public static void main(String[] args) {
        HashSet <String> hs=new HashSet<>();
        hs.add("Amit");
        hs.add("Sumit");
        hs.add("Amit");
        System.out.println(hs);

    }
}
//Here String will override the hashcode of object class so inside their if tow object data