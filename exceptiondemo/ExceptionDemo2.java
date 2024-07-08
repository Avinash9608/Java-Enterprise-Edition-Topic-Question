package exceptiondemo;
// toSreing override by java exception class
class ExceptionDemo2 {
    public static void main(String[] args) {
        try{
            int a=Integer.parseInt(args[0]);
            int b=Integer.parseInt(args[1]);
            int c=a/b;
            System.out.println("Division is "+c);
        }
        catch(Exception ex)
        {
            System.out.println("Exception occured :"+ex);
            //Java will convert ex into ex.toString() because Exception class of java override this method (toString
        }
    }
}
