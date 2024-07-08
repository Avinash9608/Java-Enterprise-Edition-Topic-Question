package POLYMORPHISM.example;

public class PolyExample {
    public static void main(String[] args) {
        Parent p;
        p=new Parent();
        p.show();
        p.display();
        System.out.println("Next ");
        p=new Child();
        p.show();
        p.display();
    }
}
