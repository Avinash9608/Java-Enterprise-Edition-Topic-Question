package Pratice_variables;

public class Test {
    //static  int a; // output 0
    int a;
    public static void main(String[] args) {
        //int a;
        Test t=new Test();
        System.out.println("Value of a is "+t.a);  // output -0
    }
}
