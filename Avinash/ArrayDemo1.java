package Avinash;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ArrayDemo1 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int arr[]=new int[10];
        int i;
        for(i=0;i<10;i++)
        {
            System.out.println("Enter no: ");
            arr[i]=kb.nextInt();
        }
        int sum=0;
        for(i=0;i<10;i++)
        {
            System.out.println((arr[i]));
            sum=sum+arr[i];
        }
        System.out.println("Sum is "+sum);
        System.out.println("Average is "+(float)sum/10);
    }
}
