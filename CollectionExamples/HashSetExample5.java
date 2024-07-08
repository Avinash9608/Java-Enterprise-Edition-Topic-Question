package CollectionExamples;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Students
{
    private String name;

    public Students(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return
                "name='" + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return name.equals(students.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
public class HashSetExample5 {
    public static void main(String[] args) {
        // hashcode of Super parent Class Object
        Students s1=new Students("Amit");
        System.out.println(s1.hashCode());
        Students s2=new Students("Amit");
        System.out.println(s2.hashCode());
//        // hashcode overriden of Super parent Class Object by string class
//        String name=new String("Golu ");
//        String name1=new String("Golu ");
//        System.out.println(name.hashCode());
//        System.out.println(name1.hashCode());
        Set<Students> studentSet=new HashSet<>();
        studentSet.add(s1);
        studentSet.add(s2);
        System.out.println("size of "+studentSet.size());
    }
}
