package FileHandling;

import java.io.*;
import java.util.Scanner;

class Emp
{
    private int age;
    private String name;
    private double sal;

    public void get()
    {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter age name and sal");
        age=kb.nextInt();
        name=kb.next();
        sal=kb.nextDouble();
    }

    public void show()
    {
        System.out.println(age);
        System.out.println(name);
        System.out.println(sal);
    }

    public void WriteInFile()
    {
        try
        {
            DataOutputStream dout;
            dout=new DataOutputStream(new FileOutputStream("D:/emp.dat"));
            dout.writeInt(age);
            dout.writeUTF(name);
            dout.writeDouble(sal);
        }
        catch (Exception ex)
        {
            System.out.println("Error in writing "+ex);
            System.exit(0);
        }
    }
    public void ReadFromFile()
    {
        try
        {
            DataInputStream din;
            din=new DataInputStream(new FileInputStream("d:/emp.dat"));
            age=din.readInt();
            name=din.readUTF();
            sal=din.readDouble();
        }
        catch (Exception ex)
        {
            System.out.println("Error in reading "+ex);
            System.exit(0);
        }
    }
}
public class FileExample5 {
    public static void main(String[] args) {
        Emp E=new Emp();
        E.get();
        E.WriteInFile();

        Emp F=new Emp();
        F.ReadFromFile();
        F.show();
    }
}
