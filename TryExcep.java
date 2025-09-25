import java.util.*;
class TryException 
{
	public static void main(String[] args)
	{

	try
	{
        				Scanner s = new Scanner(System.in);
        
		int a;
		int b;
		
		System.out.println("Enter value for A&B");
		a=s.nextInt();
		b=s.nextInt();
	    int c=a/b;
		System.out.println("Div ="+c);
	  }
	catch (ArithmeticException e)
	{

		System.out.println("Denominater Should not be Zero "+e);
         
	}
         }
		 
             }
