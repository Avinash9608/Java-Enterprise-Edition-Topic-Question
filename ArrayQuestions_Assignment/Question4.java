package ArrayQuestions_Assignment;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        int found=0;
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter size of array ");
        int n=kb.nextInt();
        int [] arr=new int [n];
        System.out.println("Enter elements in array ");
        for(int i=0;i<n;i++)
        {
            arr[i]=kb.nextInt();
        }
        System.out.println("Enter elements to be found ");
        int a=kb.nextInt();
        for (int i=0;i<n;i++)
        {
            if(arr[i]==a)
            {
                found++;
                break;
            }

        }
        System.out.println(a);
        if(found==0)
        {
            System.out.println("Element not found ");
        }
        else
        {
            System.out.println("Element found ");
        }
    }
}
