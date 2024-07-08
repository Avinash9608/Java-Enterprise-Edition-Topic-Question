package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileExample3 {
    public static void main(String[] args) {
        Reader fr=null;
        try{
            //fr=new FileReader("D:\\File_Reader.txt");
            fr=new FileReader("D:\\Demo.txt");
            int ch;
            int count=0;
            while((ch=fr.read())!=-1)
            {
                System.out.print((char)ch);
                ++count;
            }
            System.out.println("\nTotal Character read : "+count);
        }
        catch (FileNotFoundException fnf)
        {
            System.out.println("Cannot open the file "+fnf.getMessage());
        }
        catch(IOException ex)
        {
            System.out.println("Error while reading file");
        }
        finally {
            if(fr!=null)
            {
                try
                {
                    fr.close();
                }
                catch (IOException ex)
                {
                    System.out.println("Error while closing file ");
                }
            }
        }
    }
}
// This will count the \n as 2 char