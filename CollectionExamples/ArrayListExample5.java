package CollectionExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExample5 {
    public static void main(String[] args) {
        List<String> months=new ArrayList<>();
        Scanner kb=new Scanner(System.in);
        months.add("Jan");
        months.add(0,"Feb");
        months.add(1,"Mar");
        System.out.println("Enter a month name ");
        String str=kb.next();
        boolean result=months.remove(str);
        //String result=months.remove(1);
        //if(result!=str)
        if(result)
        {
            System.out.println(str+" is present ");
        }
        else
        {
            System.out.println(str +" is not present ");
        }
        System.out.println(months);
    }
}
