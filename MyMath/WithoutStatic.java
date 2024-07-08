package MyMath;

import java.sql.SQLOutput;

public class WithoutStatic {
    public int add(int a, int b)
    {
        int c=a+b;
        return c;
    }
    public int max(int a, int b)
    {
        if(a>b)
            return a;
        return b;
    }
}
class UseWithoutStatic{
    public static void main(String[] args) {
        WithoutStatic ws=new WithoutStatic();
        System.out.println("Sum is "+ws.add(12,13));
        System.out.println("Max is "+ws.max(12,43));
    }
}
