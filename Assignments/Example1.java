package Assignments;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int []arr=new int[10];
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter no: ");
            arr[i]=kb.nextInt();
        }
        int a, flag=0;
        System.out.println("Enter no you have to search ");
        a=kb.nextInt();
        for(int i=0;i<10;i++)
        {
            if(arr[i]==a) {
                flag++;
                break;
            }
        }
        if(flag==1)
            System.out.println("Found ");
        else
            System.out.println("Not Found");
    }

}
