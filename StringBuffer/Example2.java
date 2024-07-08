package StringBuffer;
//StringBuffer Append
public class Example2 {
    public static void main(String[] args) {
        StringBuffer str1=new StringBuffer("Hello");
        System.out.println(str1);
        System.out.println(str1.length());
        System.out.println(str1.capacity());
        str1.append("User");
        System.out.println(str1);
        System.out.println(str1.length());
        System.out.println(str1.capacity());
        str1.append(" java is not a programming language.");
        System.out.println(str1);
        System.out.println(str1.length());
        System.out.println(str1.capacity());

    }
}
