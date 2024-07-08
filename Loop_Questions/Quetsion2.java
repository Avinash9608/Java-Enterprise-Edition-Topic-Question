package Loop_Questions;

import java.util.Scanner;

public class Quetsion2 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter number ");
        int no=kb.nextInt();
        int reversenum=0;
        while(no>0)
        {
            reversenum=reversenum*10;
            reversenum=reversenum+ no%10;
            no=no/10;
        }
        System.out.println("REVERSE NO IS "+reversenum);
    }
}
