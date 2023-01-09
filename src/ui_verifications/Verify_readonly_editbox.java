package ui_verifications;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verify_readonly_editbox
{

	private static final String JavascriptExecutor = null;

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		((JavascriptExecutor)driver).executeScript("document.getElementById('email').setAttribute('readonly','readonly')");
		
		WebElement Email=driver.findElement(By.id("email"));
		String value=Email.getAttribute("readonly");
		
		if (value!=null && value=="true")
		{
			System.out.println("editbox not editable");
			
		}
		else
		{
			System.out.println("editbox editable");

		}
		
	  
	}

	
}
