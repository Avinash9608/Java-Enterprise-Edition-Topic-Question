package FileHandling;

import java.io.File;

public class FileExample2e {
    public static void main(String[] args) {
        File mydir=new File("D:\\Avinash_Revision_Java_Prog");
        String [] arr=mydir.list();
        System.out.println("Total members :"+arr.length);
        for(String s:arr)
            System.out.println(s);
    }
}
