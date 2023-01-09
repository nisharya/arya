
public class Logical_operators 
{

	public static void main(String[] args)
	{
		int age=20;
		boolean goodhealth=true;
		
		if (age>1 && goodhealth==false)
		{
			System.out.println("true");
			
		}
		else
		{
			System.err.println("false");
		}
		
		
		
		if (age>1 || goodhealth==true) 
		{
			System.out.println("allow");
		}
		else 
		{
			System.err.println("disallow");
		}
		
		
		if (age>1 != goodhealth==false)
		{
			System.out.println("accept");
		}
		else 
		{
			System.out.println("reject");
		}

	}

}
