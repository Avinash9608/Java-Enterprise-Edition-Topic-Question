package Assignments;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int []arr=new int[10];
        int []brr=new int[10];

        //Inputting elements in array arr
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter elements ");
            arr[i]=kb.nextInt();
        }

        //Displaying elements of array arr
        int j=0;
        for(int i=9;i>=0;i--)
        {
           // System.out.println("Elements in arr "+arr[i]);
                brr[j]=arr[i];
                j++;
        }
        for(int i=0;i<10;i++)
        {
            System.out.println("Elements in brr arr "+brr[i]);
        }
    }
}
