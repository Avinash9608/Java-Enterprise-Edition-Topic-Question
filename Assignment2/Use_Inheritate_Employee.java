package Assignment2;

import java.util.Scanner;

class Employee1
{
    private int code;
    private String name;

    public Employee1(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public Employee1() {

    }

    public void getData()
    {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter name ");
        name=kb.nextLine();
        System.out.println("Enter code ");
        code=kb.nextInt();
    }


    public int getCode()
    {
        return code;
    }
    public void setCode(int code)
    {
        this.code=code;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name=name;
    }


    public void showData()
    {
        System.out.println("Code id "+code);
        System.out.println("Name is "+name);
    }
}
class TempEmp extends Employee1
{
    private int age;
    private int days;

    public TempEmp(int code, String name) {
        super(code, name);
    }

    public TempEmp() {
        super();
    }

    public int getAge()
    {

        return age;
    }
    public void setAge(int age)
    {
        this.age=age;
    }

    public int getDays()
    {

        return days;
    }
    public void setDays(int days)
    {
        this.days=days;
    }

    public void getData()
    {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter age ");
        age=kb.nextInt();
        System.out.println("Enter days ");
        days=kb.nextInt();
    }

    public void showData()
    {
        System.out.println("Age is "+age);
        System.out.println("Number of days  is "+days);
    }
}

class PerEmp extends Employee1{
    private String department;
    private String designation;

    public PerEmp(int code, String name) {
        super(code, name);
    }

    public String getDepartment()
    {

        return department;
    }
    public void setAge(String department)
    {
        this.department=department;
    }

    public String getDesignation()
    {

        return designation;
    }
    public void setDays(String designation)
    {
        this.designation=designation;
    }

    public void getData()
    {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter Department ");
        department=kb.nextLine();
        System.out.println("Enter Designation ");
        designation=kb.nextLine();
    }

    public void showData()
    {
        System.out.println("Department  is "+department);
        System.out.println("Designation  is "+designation);
    }
}
public class Use_Inheritate_Employee {
    public static void main(String[] args) {
        Employee1 e1=new Employee1(1234,"Avinash Kumar");
        e1.showData();
        e1.getData();
        e1.showData();
        Employee1 e2=new TempEmp();
        e2.getData();
    }
}
