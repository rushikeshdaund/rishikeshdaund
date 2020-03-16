/* constructor with  parameters 
class A
{
  int x,y;
  A(int x1,int y1)
  {
    x=x1;
    y=y1;
   }
   public void dis()
   {
    System.out.println("x= "+x);
     System.out.println("y= "+y);
    }
}
class Test
{
	public static void main(String args[])
	{
		A a1=new A(10,20);
		a1.dis();
	}
}
    
