package Loop_Questions;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        char choice;
        int sum= 0;
        do {
            System.out.println("Enter an integer ");
            int no = kb.nextInt();
            sum+=no;
            System.out.println("Do you want to continue y/n?");
            choice = kb.next().charAt(0);
        } while (choice == 'Y');
        System.out.println("Sum of Odd no is " + sum);
    }
}
