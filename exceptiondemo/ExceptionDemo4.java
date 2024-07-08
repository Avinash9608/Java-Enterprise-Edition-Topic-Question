package exceptiondemo;

import java.util.Scanner;

class ExceptionDemo4 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int a, b;
        System.out.println("Enter first int");
        a=kb.nextInt();
        System.out.println("Enter second int");
        b=kb.nextInt();
        try{
            if(a==0)
            {
                //ArithmeticException obj=new ArithmeticException(); // If we not pass here any String then it will give null
                ArithmeticException obj=new ArithmeticException("Numerator should not be zero");
                throw obj;
            }
            int c=a/b;
            System.out.println("Div is "+c);
        }
        catch(ArithmeticException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
