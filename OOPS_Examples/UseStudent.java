package OOPS_Examples;

public class UseStudent {
    public static void main(String[] args) {
        Student s;
        s=new Student();
        s.setData();
        System.out.println("Data of 1st student ");
        s.showData();

        Student p;
        p=new Student();
        p.setData();
        System.out.println("Data of 2nd student ");
        p.showData();
    }
}
