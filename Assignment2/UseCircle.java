package Assignment2;

import java.util.Scanner;

class Circle
{
    private final double PI=3.14159;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void getData()
    {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter radius of circle ");
        radius=kb.nextInt();
    }


    public Circle() {
    }

    public void setRadius(double radius)
    {
        this.radius=radius;
    }

    public double getRadius()
    {
        return radius;
    }

    public double getArea()
    {
        return PI*radius*radius;
    }

    public double getPerimeter()
    {
        return 2*PI*radius;
    }
    public void showData()
    {
        System.out.println("Radius is  "+radius);
    }

}
public class UseCircle {
    public static void main(String[] args) {
        Circle c=new Circle(10);
        c.showData();
        System.out.println("Area of circle is "+c.getArea());
        System.out.println("Perimeter of circle is "+c.getPerimeter());
        Circle c1=new Circle();
        c1.getData();
        c1.showData();
        System.out.println("Area of circle is "+c1.getArea());
        System.out.println("Perimeter of circle is "+c1.getPerimeter());
    }
}
