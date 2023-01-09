package ui_verifications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verify_dropdown_availability 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		new Select(driver.findElement(By.xpath("//select[@id='customState']"))).selectByVisibleText("Goa");
		Thread.sleep(5000);
		
		boolean flag=true;
		
		try 
		{ 
			WebElement citydropdown=driver.findElement(By.xpath("//select[@id='customState']"));
			new Select(citydropdown).selectByVisibleText("Hyderabad");
			flag=false;
		
			
		} catch (Exception e)
		{
			
		}
		System.out.println("dropdown status"+flag);
	}
}
