package FileHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class FileHandling4 {
    public static void main(String[] args) {
        Writer fw=null;
        try{
            fw=new FileWriter("D:\\Assignments\\File_Writer.txt");
            Scanner kb=new Scanner(System.in);
            System.out.println("What is your name ");
            String name=kb.nextLine();
            System.out.println("What is your address ");
            String address=kb.nextLine();
            fw.write(name);
            fw.write("\n");
            fw.write(address);
        }
        catch (IOException ex)
        {
            System.out.println("Error while writing file ");
        }
        finally {
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
