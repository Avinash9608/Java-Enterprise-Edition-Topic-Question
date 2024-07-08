package ArrayQuestions_Assignment;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = kb.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        int maximum=arr[0];
        int minimum=arr[0];
        System.out.println("Max and min");
        for(int i=0;i<n;i++)
        {
            if(arr[i]>maximum)
                maximum=arr[i];
            if(arr[i]<minimum)
                minimum=arr[i];
        }
        System.out.println("The maximum value of given array is " + maximum);
        System.out.println("The minimum value of given array is " + minimum);
    }
}
