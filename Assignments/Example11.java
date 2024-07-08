package Assignments;

import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int [][]arr;
        System.out.println("Enter rows and column ");
        int row=kb.nextInt();
        int column=kb.nextInt();
        arr=new int[row][column];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                System.out.println("Enter values for arr["+i+"]["+j+"]:");
                arr[i][j]=kb.nextInt();
            }
        }
        System.out.println("Here what you have entered ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }
    }
}
