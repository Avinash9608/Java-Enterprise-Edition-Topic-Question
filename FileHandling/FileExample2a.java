package FileHandling;

import java.io.File;
import java.util.Date;
// File last Modified
public class FileExample2a {
    public static void main(String[] args) {
        File myfile=new File("D:/Assignments/Test Paper/Test Paper2.docx");
        System.out.println("File was mod on "+myfile.lastModified());
        Date d=new Date(myfile.lastModified());
        System.out.println("The Above time is "+d);
        Date p=new Date();
        System.out.println(p); // This will give current date
    }
}
