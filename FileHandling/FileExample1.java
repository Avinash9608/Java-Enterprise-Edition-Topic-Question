package FileHandling;

import java.io.File;

public class FileExample1 {
    public static void main(String[] args) {
        File myfile=new File("D:/Assignments/Test Paper/Test Paper2.docx");
        if(myfile.exists())
        {
            System.out.println(myfile.getName()+ "is present ");
        }
        else
        {
            System.out.println("File not present ");
            System.exit(0);
        }
        if(myfile.isFile())
        {
            System.out.println(myfile.getName()+" is a file");
            System.out.println("size of the file is "+myfile.length());
        }
        else
        {
            System.out.println(myfile.getName()+" is a diractory");
        }
       if(myfile.isHidden())
       {
           System.out.println(myfile.getName()+ " is a hidden ");
       }
       else
       {
           System.out.println(myfile.getName()+" is not hidden ");
       }
       if(myfile.canWrite())
       {
           System.out.println(myfile.getName()+" allows writing ");
       }
       else
       {
           System.out.println(myfile.getName()+" does not allows writing ");
       }
    }

}
