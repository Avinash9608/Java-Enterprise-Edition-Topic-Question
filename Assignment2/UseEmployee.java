package Assignment2;

import java.util.Scanner;

class Employee
{
    private String name;
    private String department;
    private String designation;
    private double basic_salary;
    public Employee(String name, String department, String designation, double basic_salary)
    {
        this.name=name;
        this.department=department;
        this.designation=designation;
        this.basic_salary=basic_salary;
    }

    public Employee() {
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public String getDepartment()
    {
        return department;
    }

    public void setDepartment(String department)
    {
        this.department=department;
    }

    public String getDesignation()
    {
        return  designation;
    }

    public void setDesignation(String designation)
    {
        this.designation=designation;
    }

    public void getData()
    {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter name ");
        name=kb.nextLine();
        System.out.println("Enter department  ");
        department=kb.nextLine();
        System.out.println("Enter designation ");
        designation=kb.nextLine();
        System.out.println("Enter basic salary ");
        basic_salary=kb.nextDouble();
    }
    public void showData()
    {
        System.out.println("Name "+name+", department "+department+", designation "+designation+" , Basic salary "+basic_salary);
    }

    public double getBasic_salary()
    {
        return basic_salary;
    }

    public void setBasic_salary(double basic_salary)
    {
        this.basic_salary=basic_salary;
    }

    public  double getHRA()
    {
        return basic_salary*20/100;
    }

    public double getDA()
    {
        return basic_salary*10/100;
    }

    public double getCA()
    {
        return basic_salary*10/100;
    }
}
public class UseEmployee {
    public static void main(String[] args) {
        Employee e=new Employee("Avinash ", "Development Team","System Engineer " ,70000.0);
        e.showData();
        System.out.println("HRA is: "+e.getHRA());
        System.out.println("DA is "+e.getDA());
        System.out.println("CA is "+e.getCA());
        Employee e1=new Employee();
        e1.getData();
        e1.showData();
        System.out.println("HRA is: "+e1.getHRA());
        System.out.println("DA is "+e1.getDA());
        System.out.println("CA is "+e1.getCA());
    }
}
