package ui_verifications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verify_title
{

	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://outlook.live.com/owa/");
		driver.manage().window().maximize();
		
		String pagetitle=driver.getTitle();
		System.out.println("current tile"+pagetitle);
		
		if (pagetitle.contains("Outlook")) 
		{
			System.out.println("outlook opened");
			WebElement signin=driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]"));
			signin.click();
			Thread.sleep(5000);
			
			if (driver.getTitle().contains("Sign in")) 
			{
				System.out.println("title present");
			}
			else 
			{
				System.err.println("title absent");
				
			}
		}

	}

}
