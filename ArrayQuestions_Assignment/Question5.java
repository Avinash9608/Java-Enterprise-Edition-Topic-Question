package ArrayQuestions_Assignment;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter size of arrays ");
        int n=kb.nextInt();
        System.out.println("Enter elements in array ");
        int [] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=kb.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            arr[i]=arr[i]+1;
        }
        System.out.println("The next number of given array is :");
        for(int num:arr)
            System.out.println(num);
    }
}
