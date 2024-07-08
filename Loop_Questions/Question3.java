package Loop_Questions;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        char choice;
        int even=0, odd=0;
        do {
            System.out.println("Enter an integer ");
            int no = kb.nextInt();
            if (no % 2 == 0) {
                even += no;
            } else if (no % 2 != 0) {
                odd += no;
            }
            System.out.println("Do you want to continue y/n?");
            choice = kb.next().charAt(0);
        }while(choice=='Y');
        System.out.println("Sum of Even no is "+even);
        System.out.println("Sum of Odd no is "+odd);
        }

}
