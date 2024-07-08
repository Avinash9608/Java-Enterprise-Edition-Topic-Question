package exceptiondemo;

import java.util.Scanner;

class InvalidNumberatorException extends Exception{
    public InvalidNumberatorException(String message)
    {
        super(message);
    }
}
public class ExceptioDemo8 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        try
        {
            System.out.println("Enter 2 int ");
            int a=kb.nextInt();
            int b=kb.nextInt();
            if(a<=0)
            {
                InvalidNumberatorException ex=new InvalidNumberatorException("Please input positive int ");
                throw ex;
            }
            int c=a/b;
        }
        catch (ArithmeticException ex)
        {
            System.out.println(ex.getMessage());
        }
        catch (InvalidNumberatorException ex)
        {
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("Thank u");
        }
    }
}
