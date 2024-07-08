package Assignments;

import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n;
        System.out.println("Enter size of array ");
        n=kb.nextInt();
        int [] arr=new int[n];
        int [] brr=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter elements in array ");
            arr[i]=kb.nextInt();
        }
        for(int i=0;i<n;i++)
        {
           if(i==n-1)
               brr[0]=arr[n-1];
           else
            brr[i+1]=arr[i];

                //arr[0]=arr[n-1];
        }
        System.out.println("array is ");
        for(int i=0;i<n;i++)
        {
            System.out.println(brr[i]);
        }
    }
}
