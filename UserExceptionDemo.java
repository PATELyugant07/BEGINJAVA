import java.util.*;
class InvalidAgeException extends Exception
{
   InvalidAgeException(String msg)
	{
		super(msg);
	}
}


class UserExceptionDemo
{
	public static void main(String[] args) 
	{
		
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age :");
		age=sc.nextInt();

		try
		{
			if(age<21)
            throw new InvalidAgeException("Age is < 21");
		else
            System.out.println("Valid Age");
		}
		catch(InvalidAgeException me)
		{
			//System.out.println(" "+me);
			System.out.println(" "+me.getMessage());
		}
		
		
	}
}
