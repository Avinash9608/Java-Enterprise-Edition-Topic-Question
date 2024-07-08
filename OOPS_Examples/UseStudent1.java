package OOPS_Examples;

import java.util.Scanner;

public class UseStudent1 {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter roll , name and per ");
        int r=kb.nextInt();
        String s=kb.next();
        double p=kb.nextDouble();
        Student1 st=new Student1();
        st.setData(r,s,p);
        st.showData();
    }
}
