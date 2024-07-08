public class Student {
    private final int roll;
    public Student(int roll)
    {
        this.roll=roll;
    }
    public void show()
    {
        System.out.println("Roll "+roll);
    }
}
class UseStudent
{
    public static void main(String[] args) {
        Student s1=new Student(101);
        Student s2=new Student(102);
        s1.show();
        s2.show();
    }
}
