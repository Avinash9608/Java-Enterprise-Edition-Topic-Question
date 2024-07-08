package Interface.example2;

public class UseMyMath {
    public static void main(String[] args) {
        MyMath m=new Calculator();
        System.out.println("Sum is:"+m.add(12,20));
        System.out.println("Sum is:"+m.subtract(12,20));
        System.out.println(MyMath.max(12,20));
    }
}
