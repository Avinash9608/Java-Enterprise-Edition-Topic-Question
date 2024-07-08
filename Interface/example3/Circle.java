package Interface.example3;

class Circle implements MyShape{
    private int rad;
    public Circle(int rad)
    {
        this.rad=rad;
    }
    public String getName()
    {
        return "Circle";
    }
    public double area()
    {
        return Math.PI*Math.pow(rad,2);
    }
}
