package switch_commands_alerts;

public class For_loop 
{

	public static void main(String[] args)
	{
		for (int i = 0; i < 10; i++) 
		{
			System.out.println(i);
		}
			
		for (int i =100; i >=90; i--)
		{
			System.out.println(i);
		}
		
		String browsers[]= {"chrome","safari","opera","edge"};
		for (int i = 0; i < browsers.length; i++) 
		{
			String eachbrowser=browsers[i];
			System.out.println(eachbrowser);
			System.out.println(eachbrowser.length());
		}
		
		String name="amdap";
		char ch[]=name.toCharArray();
		
		String str="";
		for (int i = ch.length-1; i >=0; i--)
		{
			str=str+ch[i];
		}
			System.out.println(str);
			
			StringBuilder builder=new StringBuilder(name);
			System.out.println(builder.reverse());
		
			
		

	}

}
