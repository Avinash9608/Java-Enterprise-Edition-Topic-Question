package HackerRank;

import java.util.Scanner;

import java.io.*;
import java.util.*;

public class trim {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
        s = s.trim();
        if(s.length()==0)
        {
            System.out.println(0);
        }
        else
        {
            String [] s1=s.split("['!?,._@ ]+");
            System.out.println(s1.length);
            for(String Str: s1)
                System.out.println(Str);
        }
    }
}


