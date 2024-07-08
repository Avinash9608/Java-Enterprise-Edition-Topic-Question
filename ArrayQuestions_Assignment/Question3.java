package ArrayQuestions_Assignment;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=kb.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=kb.nextInt();
        }
        System.out.println("Arrange in sorted order ");
        int temp=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]<arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Array in sorted order ");
        for(int i=0;i<n;i++)
        {
            System.out.println("Array "+arr[i]);
        }
    }
}
