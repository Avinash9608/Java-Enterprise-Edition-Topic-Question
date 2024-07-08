package exceptiondemo;

import java.util.Scanner;

public class ExceptionDemo7 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        try{
            System.out.println("Enter 2 int ");
            int a=kb.nextInt();
            int b=kb.nextInt();
            int c=a/b;
            System.out.println("Div is :"+c);
        }
        catch(ArithmeticException ex)
        {
            System.out.println("Denominator should not be zero ");
        }
        finally {
            System.out.println("Thank you");
        }

    }
}
