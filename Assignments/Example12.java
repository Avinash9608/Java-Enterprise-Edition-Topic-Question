package Assignments;

import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int num, sum=0 , rem;
        System.out.println("Enter number ");
        num=kb.nextInt();
        while(num!=0)
        {
            rem=num%10;
            sum+=rem;
            num=num/10;
        }
        System.out.println("Sum is "+sum);
    }
}
