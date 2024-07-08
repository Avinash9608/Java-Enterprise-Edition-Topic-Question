package FinalDemo.examples;

public class Circle {
    private int rad;
    private final double pi;
   /* public void setRadius(int rad)
    {
        this.rad=rad;
    }  */
    public Circle(int rad)
    {
        this.rad=rad;
        pi=3.14;
    }
    public void area()
    {
        //double area=pi*rad*rad;
        double area=pi*rad*rad; //It will increase pi=pi+1 so we should use final keyword
        System.out.println("Area is "+area);
    }
}
