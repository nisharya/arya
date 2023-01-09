package javascript_executor;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Javascript_send_charactersto_editbox 
{

	public static void main(String[] args) 
	{
	WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
	driver.get("https://www.facebook.com/");
	driver.manage().window();
	
	//Using Selenium Method Type text into editbox
	driver.findElement(By.id("email")).sendKeys("nishanth");
	((JavascriptExecutor)driver).executeScript("document.getElementById('email').value='nishanth'");
	
	//Javascript Using Xpath Identification
	WebElement password=driver.findElement(By.xpath("//input[@name='pass']"));
	((JavascriptExecutor)driver).executeScript("arguments[0].value='hello@123'",password);
		
			
		

	}

}
