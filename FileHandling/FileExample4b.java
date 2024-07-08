package FileHandling;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileExample4b {
    public static void main(String[] args) {
        PrintWriter pw=null;
        try
        {
            pw=new PrintWriter("D:\\person.txt");
            Scanner kb=new Scanner(System.in);
            for(int i=1;i<=2;i++)
            {
                System.out.println("Enter name and phone number ");
                String name=kb.next();
                long phone=kb.nextLong();
                pw.print(name+" ");
                pw.println(phone);
            }
        }
        catch(IOException ex)
        {
            System.out.println("Error while writing file ");
        }
        finally {
            if(pw!=null)
            {
                pw.close();
                System.out.println("File saved successfully ");
            }
        }
    }
}
//It will create your file if not present and write data which you give
// If file already present then it will overwrite with your input data
//phone no write without using String.valueOf