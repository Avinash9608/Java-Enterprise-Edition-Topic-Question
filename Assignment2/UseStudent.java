package Assignment2;

import java.util.Scanner;

class Student
{
    private String name;
    private char section;
    private int Class;
    private double sub1;
    private double sub2;
    private double sub3;
    private double sub4;
    private double total;
    private double percentage;
    public  Student(String name, char section, int Class, double sub1, double sub2, double sub3, double sub4)
    {
        this.name=name;
        this.section=section;
        this.Class=Class;
        this.sub1=sub1;
        this.sub2=sub2;
        this.sub3=sub3;
        this.sub4=sub4;
    }
     public String getName()
     {
         return name;
     }

     public void setName(String name)
     {
         this.name=name;
     }

     public int get_Class()
     {
         return Class;
     }

     public void setClass(int Class)
     {
         this.Class=Class;
     }

     public char getSection()
     {
         return section;
     }

     public void setSection(char section)
     {
         this.section=section;
     }

     public double getsub1()
     {
         return sub1;
     }

     public void setsub1(double sub1)
     {
         this.sub1=sub1;
     }

    public double getsub2()
    {
        return sub2;
    }

    public void setsub2(double sub2)
    {
        this.sub2=sub2;
    }

    public double getsub3()
    {
        return sub3;
    }

    public void setsub3(double sub3)
    {
        this.sub3=sub3;
    }

    public double getsub4()
    {
        return sub4;
    }

    public void setsub4(double sub4)
    {
        this.sub4=sub4;
    }

    public void getData()
    {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter name");
        name=kb.nextLine();

        System.out.println("Enter class ");
        Class=kb.nextInt();

        System.out.println("Enter section ");
        section=kb.next().charAt(0);

        System.out.println("Enter marks of sub1, sub2, sub3, sub4");
        sub1=kb.nextDouble();
        sub2=kb.nextDouble();
        sub3=kb.nextDouble();
        sub4=kb.nextDouble();
    }

    public void showData()
    {
        System.out.println("Name is "+name+", Class is "+Class+", Section "+section+", Subject 1"+sub1+", Subject 2 "+sub2+", Subject3 "+sub3+", Subject4 "+sub4);
    }

    public double getTotal()
    {
        return (sub1+sub2+sub3+sub4);
    }

    public double getPercentage()
    {
        return (getTotal()/4);
    }
}
public class UseStudent {
    public static void main(String[] args) {
        Student s1=new Student("Avinash",'A',12,70,75,80,85);
        System.out.println("Total marks "+s1.getTotal());
        System.out.println("Total percentage "+s1.getPercentage());
        s1.showData();
        s1.getData();
//        s1.getName();
//        s1.get_Class();
//        s1.getSection();
//        s1.getsub1();
//        s1.getsub2();
//        s1.getsub3();
//        s1.getsub4();
        System.out.println("Total marks "+s1.getTotal());
        System.out.println("Total percentage "+s1.getPercentage());
        s1.showData();
    }
}
