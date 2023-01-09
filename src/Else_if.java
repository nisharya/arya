
public class Else_if 
{

	public static void main(String[] args)
	{
		String browser="chrome";
		
		if (browser.equals("firefox")) 
		{
			System.out.println("firefox opened");
		}
		
		else if (browser.equals("chrome"))
		{
			System.out.println("chrome opened");	
		}
		else if (browser.equals("safari"))
		{
			System.out.println("safari opened");
		}
		else 
		{
			System.out.println("browser mismatched");
			
		}

	}

}
