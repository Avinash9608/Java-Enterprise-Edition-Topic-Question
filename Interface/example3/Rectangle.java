package Interface.example3;

class Rectangle implements MyShape{
   private int l, b;
   public Rectangle(int l, int b)
   {
       this.l=l;
       this.b=b;
   }
   public String getName()
   {
       return "Rectangle";
   }
   public double area()
   {
       return l*b;
   }
}
