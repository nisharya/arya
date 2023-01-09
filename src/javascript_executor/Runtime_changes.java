package javascript_executor;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Runtime_changes
{

	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		Thread.sleep(4000);
		
		WebElement Email=driver.findElement(By.xpath("//input[contains(@id,'email')]"));
		Thread.sleep(4000);
		js.executeScript("arguments[0].style.visibility='hidden'", Email);
		Thread.sleep(4000);
		js.executeScript("arguments[0].style.visibility='visible'", Email);
		Thread.sleep(4000);
		js.executeScript("arguments[0].disabled=true", Email);
		Thread.sleep(4000);
		js.executeScript("arguments[0].disabled=false", Email);
		
		WebElement signup=driver.findElement(By.linkText("Sign Up"));
		js.executeScript("arguments[0].setAttribute('target','_blank')", signup);
		signup.click();
		

	}

}
