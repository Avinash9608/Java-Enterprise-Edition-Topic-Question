package FileHandling;

import java.io.*;

public class FileExample4d {
    public static void main(String[] args) {
        DataOutputStream dout=null;
        DataInputStream din=null;
        try
        {
            dout=new DataOutputStream(new FileOutputStream("d:/math2.txt"));
            dout.writeDouble(Math.PI);
            dout.close();
            din=new DataInputStream(new FileInputStream("d:/math2.txt"));
            double x=din.readDouble();
            System.out.println("Value saved in file is "+x);
            din.close();
        }
        catch (IOException ex)
        {
            System.out.println("Error while writing file ");
        }
    }
}
