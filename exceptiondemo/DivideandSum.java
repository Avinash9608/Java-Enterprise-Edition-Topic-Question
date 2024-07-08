package exceptiondemo;

import java.util.InputMismatchException;
import java.util.Scanner;

class DivideandSum {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int a=0, b=0; //if this line commented the it will generate class exception and initilize is also necessory because by default it hass null (nothing)
        try{
            System.out.println("Enter 2 int ");
               a=kb.nextInt();  // int a and int b both are here declare as local we cannot get outside of try
               b=kb.nextInt();
            int c=a/b;
            System.out.println("Divide is"+c);
        }
        catch(ArithmeticException ex)
        {
            System.out.println("Denominator should not be zero");
        }
        catch(InputMismatchException ex)
        {
            System.out.println("Please enter only digits");
            System.exit(0);
        }
        int d=a+b;
        System.out.println("Sum is "+d);
    }
}
