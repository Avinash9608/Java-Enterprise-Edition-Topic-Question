package CollectionExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExample3 {
    public static void main(String[] args) {
        List<String> months=new ArrayList<>();
        Scanner kb=new Scanner(System.in);
        months.add("Jan");
        months.add("Feb");
        months.add("Mar");
        System.out.println("Enter a string ");
        String str=kb.next();
        System.out.println(str+" is present ? "+months.contains(str));
    }
}
