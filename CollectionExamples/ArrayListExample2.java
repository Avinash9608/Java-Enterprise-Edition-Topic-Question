package CollectionExamples;

import java.util.ArrayList;
import java.util.List;

// Need to print data one by one in verticle formate
public class ArrayListExample2 {
    public static void main(String[] args) {
        List<String> months=new ArrayList<> ();
        months.add("Jan");
        months.add("Feb");
        months.add("Mar");
//        for(int i=0;i<months.size();i++)
//        {
//            String str= months.get(i);
//            System.out.println(str);
//        }
        for(String str:months)
        {
            System.out.println(str);
        }
    }
}
