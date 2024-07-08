package MyMath;

class MyMath {
    public static int add(int a, int b )
    {
        int c=a+b;
        return c;
    }
    public static int max(int a, int b )
    {
        if(a>b)
            return a;
        return b;
    }
}
class UseMyMath
{
    public static void main(String[] args) {
        System.out.println("Sum of the 10 and 20 "+MyMath.add(10,20));
        System.out.println("Max of 10 and 20 is "+MyMath.max(10,20));
    }
}