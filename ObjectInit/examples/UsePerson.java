package ObjectInit.examples;

//toString override by programmer because it is not done by Object class which is super parent class of java except Exception
    class Person {
        private int age;
        private String name;
        public Person(int age, String name)
        {
            this.age=age;
            this.name=name;
        }
        public String toSting()
        {
           // return "Hello";
            return age+", "+name;
        }
    }

    public class UsePerson
    {
        public static void main(String[] args) {
            Person p=new Person(40, "Amit");
            System.out.println(p); //This will print hash code (Encyprited form)
            System.out.println(p.toSting());  // Override toString Function convert hastcode to your youtput
            String city=new String("BHOPAL");
            System.out.println(city);

        }
    }

