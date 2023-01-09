package practise;

public class Testrobot 
{
	public void walktest()
	{
		System.out.println("walktest completed");
		}
		public void runtest()
		{
			System.out.println("runtest completed");
		}
		
	public void runalltests()
	{
		walktest();
		runtest();
	}
	public static void main(String[] args)
	{
		new Testrobot().runalltests();
	}
}
