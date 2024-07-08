package StringBuffer;

public class Example1 {
    public static void main(String[] args) {
        StringBuffer sb1=new StringBuffer();
        System.out.println(sb1);
        System.out.println("Length "+sb1.length());
        System.out.println("Capacity "+sb1.capacity());

        StringBuffer sb2=new StringBuffer("Avinash");
        System.out.println(sb2);
        System.out.println("Length "+sb2.length());
        System.out.println("Capacity "+sb2.capacity());

        StringBuffer sb3=new StringBuffer(10000000);
        System.out.println(sb3);
        System.out.println("Length "+sb3.length());
        System.out.println("Capacity "+sb3.capacity());
    }
}
