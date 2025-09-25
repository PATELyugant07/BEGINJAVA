import java.io.*;
class TryCatchDemo
{
	public static void main(String[] args) 
	{
		
		int ar[]=new int[]{11,22,33,44,55};
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		try
		{
			  
				int value=ar[6];
			    System.out.println("Value : "+value);
			 
			    int d=20/10;
            
				//FileReader fr=new FileReader("C:\\myfile.txt");
			
			
			    System.out.println("Enter Contact : ");
		        int cntno=Integer.parseInt(br.readLine());
			    System.out.println("Contact : "+cntno);
			
			
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Invalid array Index! ");

		}
        catch (ArithmeticException e)
		{
			System.out.println("Divide By Zero Exception ");

		}
		catch (FileNotFoundException e)
            {
			System.out.println("File Not Found in the Path! ");

		    }
		catch (Exception e)
		{
			System.out.println("Exception ");

		}
		
		

		
	}
}
