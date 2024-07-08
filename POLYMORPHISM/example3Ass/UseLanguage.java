package POLYMORPHISM.example3Ass;

public class UseLanguage {
    public static void main(String[] args) {
        Language l;
        l=new Hindi();
        l.greetings();

        l=new English();
        l.greetings();

        l=new French();
        l.greetings();
    }
}
