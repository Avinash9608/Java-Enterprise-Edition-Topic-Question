package Interface.example2;

interface MyMath {
    default int add(int x, int y)
    {
        return x+y;
    }
    int subtract(int x, int y);
    public static int max(int a, int b)
    {
        if(a>b)
            return  a;
        return  b;
    }
}

