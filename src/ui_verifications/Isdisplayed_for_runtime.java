package ui_verifications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Isdisplayed_for_runtime
{

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();  	//Launch browser
		driver.get("https://www.facebook.com/reg/");  //Load webpage
		driver.manage().window().maximize();
		
		WebElement email=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		email.clear();
		email.sendKeys("nishu@info.com");
		Thread.sleep(2000);
		
		WebElement email_confirmation=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		if (email_confirmation.isDisplayed())
		{
			email_confirmation.sendKeys("nishu@info.com");
			
		} 
		else 
		{
			System.out.println("confirmation not displayed");

		}
	}

}
