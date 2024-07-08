package OverridingEquals;

class UseBox {
    public static void main(String[] args) {
        Box b1=new Box(10, 20, 30);
        Box b2=new Box(10, 20, 30);
        b1.show();
        b2.show();
        System.out.println(b1.equals(b2));
    }
}
