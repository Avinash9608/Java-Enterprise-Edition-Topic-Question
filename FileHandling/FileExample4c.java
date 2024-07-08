package FileHandling;

import java.io.IOException;
import java.io.PrintWriter;

public class FileExample4c {
    public static void main(String[] args) {
        PrintWriter pw=null;
        try
        {
            pw=new PrintWriter("D:\\Math.txt");
            pw.println(Math.PI);
        }
        catch(IOException ex)
        {
            System.out.println("Error while opening file ");
        }
        finally {
            if(pw!=null)
                try
                {
                    pw.close();
                    System.out.println("File saved sucessfully ");
                }
            catch(Exception e)
            {
                System.out.println("Error while closing the file ");
            }
     }
    }
}
