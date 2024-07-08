package Assignment2;

class Rectangle
{
    private double weidth;
    private double length;
    private double area;
    void get(double weidth, double length)
    {
        this.weidth=weidth;
        this.length=length;
    }
    void show()
    {
        System.out.println("Width "+weidth+", Length "+length);
    }
    double area()
    {
        return 2*weidth*length;
    }
}
public class UseRectangle {
    public static void main(String[] args) {
       Rectangle obj=new Rectangle();
       obj.get(10,2);
       obj.show();
        System.out.println(" Area of rectangle is "+obj.area());
    }
}
