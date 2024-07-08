package CollectionExamples;

import java.util.*;

class Emp implements Comparable<Emp>
{
    private int age;
    private String name;
    private double sal;

    public Emp(int age, String name, double sal) {
        this.age = age;
        this.name = name;
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "age=" + age +
                ", name='" + name + '\'' +
                ", sal=" + sal ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emp emp = (Emp) o;
        return age == emp.age && Double.compare(emp.sal, sal) == 0 && name.equals(emp.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, sal);
    }

    @Override
    public int compareTo(Emp o) {
        int result=this.name.compareTo(o.name);
        {
            if(result>0)
                return 1;
            else if(result<0)
                return -1;
            else
                return 0;
        }
    }
}
public class ArrayListExample6 {
    public static void main(String[] args) {
        List<Emp> empList=new ArrayList<>();
        Emp e1=new Emp(21,"amit",45000.0);
        Emp e2=new Emp(25,"deepak",70000.0);
        Emp e3=new Emp(19,"ravi",55000.0);
        Emp e4=new Emp(22,"ajay",65000.0);
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        for(Emp e:empList)
        {
            System.out.println(e);
        }
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter age , name and sal of the employee you want to delete ");
        int age=kb.nextInt();
        String name=kb.next();
        double sal=kb.nextDouble();
        Emp f=new Emp(age, name, sal);
        boolean result=empList.remove(f);
        if(result)
        {
            System.out.println("Employee removed! ");
        }
        else
        {
            System.out.println("Employee not found ");
        }
        for(Emp e:empList)
        {
            System.out.println(e);
        }
        System.out.println("Sorting on the basis of name ");
        Collections.sort(empList);
        for(Emp e:empList)
        {
            System.out.println(e);
        }
    }
}
