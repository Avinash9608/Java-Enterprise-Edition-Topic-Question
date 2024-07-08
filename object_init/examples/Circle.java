package object_init.examples;

class Circle {
    private int radius;
    public void setRadius(int rad)
    {
        radius=rad;
    }
    public void CalculateArea()
    {
        double ar=Math.PI*Math.pow(radius,2);
        System.out.println("Area is "+ar);
    }
}
