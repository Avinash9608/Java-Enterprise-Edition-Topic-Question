package ArrayQuestions_Assignment;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n;
        int even=0, odd=0;
        System.out.println("Enter size of array ");
        n=kb.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter elements in array ");
        for(int i=0;i<n;i++)
        {
            arr[i]=kb.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                even=arr[i];
                System.out.print(" "+even);
            }
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2!=0)
            {
                odd=arr[i];
                System.out.print(" "+odd);
            }
        }
        System.out.println();
    }
    
}
