package ui_verifications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verify_element_pagesource 
{

	public static void main(String[] args)
	{
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		if (driver.getPageSource().contains("email"))
		{
			WebElement Email=driver.findElement(By.id("email"));
			Email.clear();
			Email.sendKeys("nishanth");
			
			
		}
		else
		{
			System.out.println("element not present");
			
		}
		

	}

}
