package CollectionExamples;

import java.util.HashSet;

class Student
{
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name='" + name;
    }
}
public class HashCodeDemo2 {
    public static void main(String[] args) {
        HashSet <Student> hs=new HashSet<>();
        Student s1=new Student("Amit");
        Student s2=new Student("Sumit");
        Student s3=new Student("Amit");
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        System.out.println(hs);
    }
}
// it will allow duplicate because here run hashcode of object  and every object has different hast code so s1 and s3
// are different object so they have different hashcode