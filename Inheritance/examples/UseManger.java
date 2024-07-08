package Inheritance.examples;

public class UseManger {
    public static void main(String [] args)
    {
        Manager boss=new Manager();
        boss.setData("Avinash", 100000.0);
        boss.setBouns(20000.0);
        System.out.println("Manger's Name "+boss.getName());
        System.out.println("Manger's income "+boss.getIncome());
    }
}
