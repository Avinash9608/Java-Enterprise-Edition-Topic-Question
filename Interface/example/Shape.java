package Interface.example;

interface Shape {
    String getName();
    double area();
}
class Circle implements Shape{
    private int rad;
    public Circle(int rad){
        this.rad=rad;
    }
    public String getName()
    {
        return  "Circle";
    }
    public double area()
    {
        return Math.PI*Math.pow(rad,2);
    }
}

class Rectangle implements Shape{
    private int l,b;
    public Rectangle(int l, int b)
    {
        this.l=l;
        this.b=b;
    }
    public String getName()
    {
        return "Rectangle ";
    }
    public double area()
    {
        return l*b;
    }
}