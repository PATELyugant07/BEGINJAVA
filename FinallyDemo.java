import java.io.*;
class FinallyDemo
{
	public static void main(String[] args) 
	{
		
		int ar[]=new int[]{11,22,33,44,55};
        
			try
			{
			
					int value=ar[6];
			       System.out.println("Value : "+value);
			
			}
			finally
		        {
			   System.out.println("This Must Execute ");
		         }
			
			/*catch (Exception e)
		   {
			System.out.println("Exception Occured! ");

		    }*/
			 
			
		    
			
		
		
		
		
		
		
        
		
	/*catch (Exception e)
		{
			System.out.println("Exception Occured! ");

		}	
	*/	

		
	}
}
