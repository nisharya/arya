package ui_verifications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verify_using_trycatch
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		try {
			
			WebElement Email=driver.findElement(By.id("email"));
			Email.clear();
			Email.sendKeys("nishanth");
			
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}

	}

}
