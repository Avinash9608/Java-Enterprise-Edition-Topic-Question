package Assignments;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int []arr=new int[10];
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter elements ");
            arr[i]=kb.nextInt();
        }
        int maximum=arr[0], minimum=arr[0];
        for(int i=0;i<10;i++)
        {
            if(arr[i]>maximum)
                maximum=arr[i];
            if(arr[i]<minimum)
                minimum=arr[i];
        }
        System.out.println("Maximum "+maximum);
        System.out.println("Minimum "+minimum);
    }
}
