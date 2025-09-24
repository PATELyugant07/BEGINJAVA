import java.io.*;
class Calci
{
	void operation() throws Exception
	{
		
		division();	
		
	}
	void division() throws Exception
	{
		
		int div=20/0;
		System.out.println("Division ="+div);

	}
}


class ThrowsDemo
{
	public static void main(String[] args)
		
	{
	  Calci c=new Calci();
	  
	  try
		{
		c.operation();
		}
		catch(Exception e)
		{
        System.out.println("Exception handled");
		
		}
		 
		
     }
}

/*try
		{
		
		}
		catch(Exception e)
		{
        System.out.println("Exception handled");
		
		}*/