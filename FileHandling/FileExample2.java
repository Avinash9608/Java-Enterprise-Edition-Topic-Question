package FileHandling;
// file create by self delete by code
import java.io.File;

public class FileExample2 {
    public static void main(String[] args) {
      File myfile=new File("D:/Assignments/Test Paper/mysecrete.txt");
        System.out.println(myfile.getName()+ " is present ");
        System.out.println(myfile.getName()+" is of "+myfile.length()+" bytes ");
        System.out.println(myfile.getName()+" is delete ?"+myfile.delete());
        System.out.println(myfile.getName()+" is present ?"+myfile.exists());
    }
}
/*
We have to first here create a txt file named as mysecrete.txt and write somthing in them
after executing this code it will check file read size then delete and after that check then return false
*/

