package Loop_Questions;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter number ");
        int a=kb.nextInt();
        System.out.println("Enter power of that no");
        int b=kb.nextInt();
        int power=1;
        if(b>=1)
        {
            for(int i=1;i<=b;i++)
            {
                power*=a;
            }
        }
        System.out.println("Value of the number is"+power);
    }

}
