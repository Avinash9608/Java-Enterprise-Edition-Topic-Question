package FileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileExample3b {
    public static void main(String[] args) {
        FileReader fr=null;
        try{
            //fr=new FileReader("D:\\File_Reader.txt");
            fr=new FileReader("D:\\Demo.txt");
            BufferedReader br=new BufferedReader(fr);
            String str;
            int count=0;
            while((str=br.readLine())!=null)
            {
                System.out.println(str);
                count=count+str.length();
            }
            System.out.println("Total character read :"+count);
        }
        catch (FileNotFoundException fnf)
        {
            System.out.println("Cannot open the file ");
        }
        catch (IOException ex)
        {
            System.out.println("Error while reading the file ");
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
                    System.out.println("Error while closing the file ");
                }
            }
        }
    }
}
//This will not include(count) \n