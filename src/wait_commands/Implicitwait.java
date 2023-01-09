package wait_commands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Implicitwait 
{

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		
		long starttime=System.currentTimeMillis();
		
		try
		{
			driver.findElement(By.id("email"));
			System.out.println("object is found");
			System.out.println(System.currentTimeMillis()-starttime);
			
			
		} 
		
		catch (Exception e)
		{
			System.out.println("object not found");
			System.out.println(System.currentTimeMillis()-starttime);
		}
		
		
	}

}
