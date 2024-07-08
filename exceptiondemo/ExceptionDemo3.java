package exceptiondemo;
// printStackTrace()
public class ExceptionDemo3 {
    public static void main(String [] args)
    {
        try{
            int a=Integer.parseInt(args[0]);
            int b=Integer.parseInt(args[1]);
            int c=a/b;
            System.out.println("Division is "+c);
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
/*
ex.printStackTrace();
This method belongs to Throwable class
It return 5 things about Exception
1. Name of Exception class
2. Error message related to he Exception
3. Name of the method where exception occured
4. Name of the source code where exception occured
5. Line number of the code which generated the Exception.
 */