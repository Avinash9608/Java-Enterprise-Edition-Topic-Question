package Assignments;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int []arr=new int [20];
        for(int i=0;i<20;i++)
        {
            System.out.println("Enter elements ");
            arr[i]=kb.nextInt();
        }
        int positive=0, negative=0, even=0, odd=0, zero=0;
        for(int i=0;i<20;i++)
        {
            if(arr[i]>0)
            {
                positive++;
            }
            else if (arr[i]<0)
            {
                negative++;
            }
            else if (arr[i]==0)
            {
                zero++;
            }
             if (arr[i]%2==0)
            {
                even++;
            }
             if (arr[i]%2!=0)
            {
                odd++;
            }
        }
        System.out.println("Number of postive number "+positive);
        System.out.println("Number of negative number "+negative);
        System.out.println("Number of zero number "+zero);
        System.out.println("Number of even number "+even);
        System.out.println("Number of odd number "+odd);
    }
}
