package css_selectors;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webdriver_global_initiation
{

	WebDriver driver=null;
	public void launchbrowser() 
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	public void loadwebpage()
	{
		driver.get("http://facebook.com");
		
	}
	
	public void login() 
	{
		WebElement Email=driver.findElement(By.id("email"));
		Email.sendKeys("saiaditya123@gmail.com");
		
	}
	public static void main(String[] args) throws Exception
	{
		Webdriver_global_initiation obj=new Webdriver_global_initiation();
		obj.launchbrowser();
		obj.loadwebpage();
		Thread.sleep(5000);
		obj.login();
		
	}

}
