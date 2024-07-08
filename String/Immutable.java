package String;

import java.util.Locale;

public class Immutable {
    public static void main(String[] args) {
        String name="Avinash";
        System.out.println(name);
        name=name+" Kumar";
        System.out.println(name);
        name=name+" Panday";
        System.out.println(name);
        String name1=new String();
        System.out.println(name1.length());
        String name2=new String("Madhukar");
        System.out.println(name2.length());

        String s1=new String("Avinash");
        String s2=new String("Avinash");
        System.out.println(s1==s2);

        String s3="Avinash";
        String s4="Avinash";
        System.out.println(s3==s4);

        char [] arr={'b', 'h', 'o', 'p', 'a', 'l'};
        //String city=arr;
        String city=new String(arr);
        System.out.println(city);
        System.out.println(city.length());
        String city1=new String(arr,3,3);
        System.out.println(city1);
        System.out.println(city1.length());
        System.out.println(city.charAt(0));
        System.out.println(city.charAt(3));
        //System.out.println(city.charAt(8)); // Exception: StringIndexOutOfBoundException

        String p1=new String("Bhopal");
        String p2=new String("Bhopal");
        String p3=new String("bhopal");
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));

        System.out.println(p1.compareTo(p2));
        System.out.println(p1.compareTo(p3));

        System.out.println(p1.equalsIgnoreCase(p2));
        System.out.println(p1.equalsIgnoreCase(p3));

        System.out.println(p1.compareToIgnoreCase(p2));
        System.out.println(p1.compareToIgnoreCase(p3));

        String str="Welcome";
        System.out.println(str.indexOf("come"));
        System.out.println(str.indexOf("came"));
        System.out.println(str.indexOf('e'));

        String str1="WelcomeTOMWelcome";
        System.out.println(str1.indexOf("come"));
        System.out.println(str1.lastIndexOf("come"));

        System.out.println(str.indexOf('e'));
        System.out.println(str1.lastIndexOf('M'));

        String A1="Bhopal";
        System.out.println(A1.substring(1,4));
        System.out.println(A1.substring(2));
        System.out.println(A1.startsWith("bho"));
        System.out.println(A1.startsWith("Bho"));
        System.out.println(A1.startsWith("hopal"));
        System.out.println(A1.startsWith("opal"));

        System.out.println(A1.endsWith("opal"));
        System.out.println(A1.endsWith("pal"));
        System.out.println(A1.endsWith("al"));
        System.out.println(A1.endsWith("opa"));

        System.out.println(A1.toUpperCase());
        System.out.println(A1.toLowerCase());

        int a=10;
       // String str2=a; //Error
        String str2=String.valueOf(a);
        System.out.println(str2);

      //  String str3=Math.PI; Error
        String str3=String.valueOf(Math.PI);
        System.out.println(str3);


    }
}
