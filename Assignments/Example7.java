package Assignments;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n;
        System.out.println("Enter size of array ");
        n= kb.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter elements in array ");
            arr[i]=kb.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        int  max_diff=0;

//        int second_smallest=Integer.MAX_VALUE;
        int second_smallest=max;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
                max=arr[i];
            if(arr[i]<min)
                min=arr[i];
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=min && arr[i]<second_smallest)
                second_smallest=arr[i];
        }
        max_diff=max-min;
        System.out.println("Max difference is "+max_diff);
        System.out.println("Max is "+max);
        System.out.println("Min is "+min);
        System.out.println("Second max "+second_smallest);
    }
}
