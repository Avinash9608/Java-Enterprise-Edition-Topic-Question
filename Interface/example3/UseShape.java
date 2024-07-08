package Interface.example3;

class UseShape {
    public static void main(String[] args) {
        MyShape s;
        s=new Circle(5);
        System.out.println("Shape is :"+s.getName());
        System.out.println("Shape is :"+s.area());

        s=new Rectangle(10,2);
        System.out.println("Shape is :"+s.getName());
        System.out.println("Shape is :"+s.area());
    }
}
