package switch_commands_alerts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Switchto_new_window 
{

	public static void main(String[] args) throws Exception 
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	
	String mainwindowid=driver.getWindowHandle();
	System.out.println(driver.getTitle());
	
	WebDriver meta=driver.switchTo().newWindow(WindowType.WINDOW);
	meta.get("https://about.meta.com/");
	System.out.println(driver.getTitle());
	String metawindowid=meta.getWindowHandle();
	
	meta.switchTo().window(mainwindowid);
	System.out.println(driver.getTitle());
	
	driver.switchTo().window(metawindowid);
	System.out.println(driver.getTitle());
	
	
	}

}
