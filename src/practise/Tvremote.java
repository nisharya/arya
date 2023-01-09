package practise;

public class Tvremote 
{
	public void on()
	{
		System.out.println("television is on");
	}
	
	public void off()
	{
		System.out.println("television is off");
	}
	
	public static void main(String[] args) 
	{
		
		new Tvremote().on();
		new Tvremote().off();
	}
	

}
