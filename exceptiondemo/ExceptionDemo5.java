package exceptiondemo;

import java.io.IOException;
import java.util.Scanner;

class Input{
    public void acceptInt()
    {
        Scanner kb=new Scanner(System.in);
        int a;
        System.out.println("Enter an int :");
        a=kb.nextInt();
        System.out.println("You inputted "+a);
    }

    public void acceptChar() throws IOException
    {
        System.out.println("Enter a char");
        char ch;
        ch=(char)System.in.read();
        System.out.println("You inputted "+ch);
    }
}
public class ExceptionDemo5 {
    public static void main(String[] args) throws  IOException{
        Input obj=new Input();
        obj.acceptInt();
        obj.acceptChar();
    }
}
