package FileHandling;

import java.io.File;

public class FileExample2d {
    public static void main(String[] args) {
        File newmkdirs=new File("D:\\Assignments\\Test Paper\\Madhya Pradesh\\Bhopal\\Sharma Computer Acadmy");
        System.out.println(newmkdirs.getName()+" exists ?"+newmkdirs.exists());
        System.out.println(newmkdirs.getName()+" got created ?"+newmkdirs.mkdirs());
        System.out.println(newmkdirs.getName()+" exists ? "+newmkdirs.exists());
    }
}
