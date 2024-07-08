package Interface.example;

public class UseShape {
    public static void main(String[] args) {
        Shape s;
        s=new Circle(5);
        System.out.println("Shape is: "+s.getName());
        System.out.println("Area is "+s.area());

        s=new Rectangle(5,10);
        System.out.println("Shape is: "+s.getName());
        System.out.println("Area is "+s.area());
    }
}
