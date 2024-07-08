package OOPS_Examples;

import java.util.Scanner;

public class Student {
    private int roll;
    private String name;
    private double per;

    public void setData()
    {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter roll , name and per ");
        roll=kb.nextInt();
        name=kb.next();
        per=kb.nextDouble();
    }
    public void showData()
    {
        System.out.println("Roll= "+roll);
        System.out.println("Name= "+name);
        System.out.println("Per= "+per);
    }
}
