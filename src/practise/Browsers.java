package practise;

public class Browsers 
{
	public void setupbrowser()
	{
		System.out.println("browser is open");
	}
 public void visit_site()
 {
	 System.out.println("site id open");
 }
 public void capturescreen()
 {
	 System.out.println("screen is captured");
 }
 public void screen()
 {
	 setupbrowser();
	   visit_site();
	   capturescreen();
 }
	
	public static void main(String[] args) 
	{
	 new Browsers().setupbrowser();
	 new Browsers().visit_site();
	 new Browsers().capturescreen();
	}

}
