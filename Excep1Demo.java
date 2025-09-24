import java.util.*;
class Excep1Demo

{

	public void show() //throws Exception
	{
	try
	{
		
	int n=10/0;
	}
	
	catch (Exception e)
	{
		System.out.println("Exception Caught");
	}
	}
	
    


	public void print() //throws Exception
	{
	
	  show();
	}

	

	
	public static void main(String[] args)
	{
		Excep1Demo d=new Excep1Demo();
		d.print();
/*try
{
	Excep1Demo d=new Excep1Demo();
		d.print();
}
catch (ArithmeticException e)
{
System.out.println("arithmeticException in main() "+e);
}
catch (Exception e)
{


System.out.println("Exception in main() "+e);
}*/		
	}
}

