package practise;

public class Geartest
{

	public Geartest() 
	{
		System.out.println("hold clutch");
	}
	public void change_gear1()
	{
		System.out.println("change to gear1");
	}
	public void change_gear2()
	{
		System.out.println("change to gear2");
	}
	public void change_gear3()
	{
		System.out.println("change to gear3");
	}
	 public static void main(String[] args)      
	{
		new Geartest().change_gear1();
		new Geartest().change_gear2();
		new Geartest().change_gear3();
	}

}
