package ui_verifications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class verifytext_at_webpage
{

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/reg");
		driver.manage().window().maximize();
		
		WebElement signup=driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		signup.click();
		Thread.sleep(5000);
		
		WebElement page=driver.findElement(By.tagName("body"));
		
		String pagetext=page.getText();
		
		if (pagetext.contains("What's your name?")) 
		{
			System.out.println("error label present");
			
		}
		else 
		{
			System.out.println("error label absent");

		}
;
	}

}
