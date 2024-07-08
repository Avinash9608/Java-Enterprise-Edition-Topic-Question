package ArrayQuestions_Assignment;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=kb.nextInt();
        int [] arr=new int[n];
        int sum=0;
        System.out.println("Enter the array elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=kb.nextInt();
            sum+=arr[i];
        }
        System.out.println("The sum of given Array is:"+sum);
    }
}
