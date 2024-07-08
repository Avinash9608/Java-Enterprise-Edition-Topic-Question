package CollectionExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExample4 {
    public static void main(String[] args) {
        List<String> months=new ArrayList<>();
        Scanner kb=new Scanner(System.in);
        months.add("Jan");
        months.add(0,"Feb");
        months.add(1,"Mar");
        System.out.println("Enter a month name ");
        String str=kb.next();
        int pos=months.indexOf(str);
        if(pos==-1)
        {
            System.out.println(str+" is not present ");
        }
        else
        {
            System.out.println(str+" is present at position "+pos);
        }
    }
}
