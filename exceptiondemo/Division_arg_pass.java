package exceptiondemo;
public class Division_arg_pass {
    public static void main(String [] args)
    {
        try{
            int a=Integer.parseInt(args[0]);
            int b=Integer.parseInt(args[1]);
            int c=a/b;
            System.out.println("Divide is "+c);
        }
        catch(Exception e)
        {
            System.out.println("Some exception occured: "+e.getMessage());
        }
    }
}
