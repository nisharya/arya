package browser_launch;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class Launch_iebrowser 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.ie.driver", "C:\\Backup folder selenium\\ie driver\\IEDriverServer.exe");
		InternetExplorerDriver ie=new InternetExplorerDriver();
		ie.get("http://google.com");
		
		String pagetitle=ie.getTitle();
		System.out.println(pagetitle);
		
	}

}
