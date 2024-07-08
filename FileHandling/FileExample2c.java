package FileHandling;

import java.io.File;
// mkdir in this you have create file by yourself at your location
public class FileExample2c {
    public static void main(String[] args) {
        File newdir=new File("D:\\Assignments\\Test Paper\\mp\\bhopal\\sca");
        System.out.println(newdir.getName()+" exits ?"+newdir.exists());
        System.out.println(newdir.getName()+" got created ?"+newdir.mkdir());
        System.out.println(newdir.getName()+" exists ?"+newdir.exists());
    }
}
