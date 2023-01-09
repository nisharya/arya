package ui_verifications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verify_url 
{

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://outlook.live.com/owa/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		if (driver.getTitle().contains("Outlook")) 
		{
			WebElement signin=driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]"));
			signin.click();
			Thread.sleep(5000);
			
			if (driver.getCurrentUrl().contains("https://login.live.com/login"))
			{
				System.out.println("url present");
			}
			else
			{
				System.out.println("url absent");
			}
			
		}
		else 
		{
			System.out.println("Orange HRM homepage tilte is mismatched");
			
		}
		

	}

}
