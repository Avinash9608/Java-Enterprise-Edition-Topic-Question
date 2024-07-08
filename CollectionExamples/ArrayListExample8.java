package CollectionExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee> {
    private int age;
    private String name;
    private double sal;

    public Employee(int age, String name, double sal) {
        this.age = age;
        this.name = name;
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "age=" + age +
                ", name='" + name + '\'' +
                ", sal=" + sal;
    }

    @Override
    public int compareTo(Employee o) {
        // Sorting on the basis of age
      /*  if(this.age>o.age)
            return  1; // this will swap (poitive no return then swapping)
        else if(this.age<o.age)
            return  -1;
        else
            return 0; */
        // sorting on the basis of name
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
public class ArrayListExample8 {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        Employee e1 = new Employee(21, "amit", 45000.0);
        Employee e2 = new Employee(25, "deepak", 70000.0);
        Employee e3 = new Employee(19, "ravi", 55000.0);
        Employee e4 = new Employee(22, "ajay", 65000.0);
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        System.out.println("Before sorting ");
        for (Employee e : empList) {
            System.out.println(e);
        }
        System.out.println("After sorting ");
        Collections.sort(empList);
        for (Employee e : empList) {
            System.out.println(e);
        }
    }
}
