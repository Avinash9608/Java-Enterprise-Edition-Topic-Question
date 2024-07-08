package OOPS_Examples;

public class Student1 {
    private int roll;
    private String name;
    private double per;

    public void setData(int r, String n, double p)
    {
        roll=r;
        name=n;
        per=p;
    }
    public void showData()
    {
        System.out.println("Roll "+roll);
        System.out.println("Name "+name);
        System.out.println("per ="+per);
    }
}
