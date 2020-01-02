interface Calculator
{
 int sum(int x,int y);
 int product(int x,int y);
}
class AbcCalci implements Calculator
{
  public int sum(int x,int y)
  {
    return x+y;
  }
   public int product(int x,int y)
  {
    return x*y; 
}
}
class XyzCalci implements Calculator
{
  public int sum(int x,int y)
  {
    return x-(-y);
  }
  public int product(int x,int y)
{
return x*y;
}
}
class Test10
{
 public static void main (String args[])
 {
  Calculator c=new AbcCalci();
  Calculator a=new XyzCalci();
   System.out.println("Abc.sum is "+c.sum(10,20));
   System.out.println("Abc.product is "+c.product(10,20));
   System.out.println("Xyz.sum is "+a.sum(10,20));
   System.out.println("Xyz.product is "+a.product(10,20));
}
}