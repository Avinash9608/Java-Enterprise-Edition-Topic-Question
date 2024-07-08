package CollectionExamples;

import java.util.ArrayList;
import java.util.List;

// add with index
public class ArrayListExampleb {
    public static void main(String[] args) {
        List<String> months=new ArrayList<>();
        months.add("Jan");
        months.add(0,"Feb");
        months.add(1,"Mar");
        //months.add(4,"Mar"); // This line will throw exception
        System.out.println(months);
    }
}
