package Assignments;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int [] arr=new int[10];
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter elements ");
            arr[i]=kb.nextInt();
        }
        int sum=0, product=1;
        for(int i=0;i<10;i++)
        {
            sum+=arr[i];
            product*=arr[i];
        }
        System.out.println("Sum is "+sum);
        System.out.println("Product is "+product);
    }
}
