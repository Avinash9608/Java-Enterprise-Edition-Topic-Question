package MethodOfStringBuffer;

import javax.print.DocFlavor;

class Example1 {
    public static void main(String[] args) {
        StringBuffer sb1=new StringBuffer();
        System.out.println(sb1);
        System.out.println("Length "+sb1.length());
        System.out.println("capacity "+sb1.capacity());

        StringBuffer sb2=new StringBuffer("Hello");
        System.out.println(sb2);
        System.out.println("Length "+sb2.length());
        System.out.println("capacity "+sb2.capacity());
    }
}
