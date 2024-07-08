package Loop_Questions;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter n1");
        int n1= kb.nextInt();
        System.out.println("Enter n2");
        int n2= kb.nextInt();
        int hcf=0;
        for(int i=1; i<=n1 || i<=n2; i++)
        {
            if(n1%i==0 && n2%i==0)
            hcf=i;
        }
        System.out.println("Hcf of "+n1+" and "+n2+" is "+hcf);
    }
}
