package browser_launch;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chromebrowser
{
		
	

	public static void main(String[] args) 
	{
	WebDriverManager.chromedriver().setup();
	ChromeDriver chrome = new ChromeDriver();
	chrome.get("http://facebook.com");
	System.out.println(chrome.getTitle());
	chrome.close();
	}
	

}
