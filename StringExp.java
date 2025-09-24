import java.io.*;
class StringExp extends Exception

{
    String alphanum;
	int aflag=0;
	int dflag=0;
	
	StringExp(String st)
	{
		super(st);
		
	
	}
	
	void test()throws IOException
	{
		
	try
	   {

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("Enter Alphanumeric String");
     
	 alphanum=br.readLine();

		 
	for(int i=0; i<alphanum.length();i++)
		
		{
    char ch=alphanum.charAt(i);

	if(Character.isDigit(ch))
		dflag=1;
	if(Character.isAlphabetic(ch))
		aflag=1;
		}

	if(dflag==0 || aflag==0)

		throw new StringExp("Invalid.. String is not Alphanumeric.... Pls Re-Enter");

	     System.out.println("Enterred String is "+alphanum);
		 
	}
	catch (StringExp e)
	{
	System.out.println(e.getMessage());
	         test();


	}
	}

	
	public static void main(String[] args)throws IOException
	{
	
	StringExp p=new StringExp("");
	p.test();
	
	}
}

