package Loop_Questions;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter a number ");
        int n=kb.nextInt();
        boolean isPrime=true;
        if(n==0 || n==1)
        {
            System.out.println("Number is not prime ");
        }
        else
        {
            for(int i=2;i<=n/2;i++)
            {
                int temp=n%i;
                if(temp==0)
                {
                    isPrime=false;
                    break;
                }
            }
            if(isPrime)
            {
                System.out.println("No is prime ");
            }
            else
            {
                System.out.println("Number is not prime ");
            }
        }
    }
}
