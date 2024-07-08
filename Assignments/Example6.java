package Assignments;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int []arr=new int[10];
        for (int i=0;i<10;i++)
        {
            System.out.println("Enter elements ");
            arr[i]=kb.nextInt();
        }
        int len=arr.length;
        int flag=0;
        System.out.println("Len " +len);
        for(int i=0;i<len-1;i++)
        {
            if(arr[len-1] == arr[i])
            {
                flag++;
                break;
            }
        }
        if(flag==0)
            System.out.println("No ");
        else
            System.out.println("Yes ");
    }
}
