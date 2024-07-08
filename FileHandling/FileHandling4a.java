package FileHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling4a {
    public static void main(String[] args) {
        FileWriter fw=null;
        try
        {
            fw=new FileWriter("D:\\Assignments\\File_Writer2.txt");
            Scanner kb=new Scanner(System.in);
                System.out.println("Enter name and Phone no ");
                String name=kb.next();
                long phone=kb.nextLong();
                String.valueOf(phone);
                fw.write(name);
                fw.write("\n");
                fw.write(String.valueOf(phone));
        }
        catch (IOException ex)
        {
            System.out.println("Error while writing file ");
        }
        finally
        {
            if(fw!=null)
            {
                try
                {
                    fw.close();
                    System.out.println("File Saved Successfully ");
                }
                catch (IOException ex)
                {
                    System.out.println("Error while closing file");
                }
            }
        }
    }
}
// This will for 1 record