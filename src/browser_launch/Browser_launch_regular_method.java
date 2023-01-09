package browser_launch;

import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_launch_regular_method 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Backup folder selenium\\chromedriver\\chromedriver.exe");
		ChromeDriver chrome=new ChromeDriver();
		chrome.get("http://facebook.com");
		System.out.println(chrome.getTitle());
		chrome.close();


	}

}
