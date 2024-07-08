package CollectionExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample7 {
    public static void main(String[] args) {
        List<String> nameList=new ArrayList<>();
        List <Integer> numList=new ArrayList<>();
        nameList.add("amit");
        nameList.add("deepak");
        nameList.add("brejesh");
        nameList.add("ajet");
        Collections.sort(nameList);
        for(String s:nameList)
        {
            System.out.println(s);
        }
        numList.add(25);
        numList.add(7);
        numList.add(50);
        numList.add(15);
        Collections.sort(numList);
        for(Integer i:numList)
        {
            System.out.println(i);
        }
    }
}
