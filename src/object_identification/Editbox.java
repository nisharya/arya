package object_identification;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Editbox
{

	public static void main(String[] args) throws Exception 
	{
	  WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
	  driver.get("http://outlook.com");
	  driver.manage().window().maximize();
	  
	  driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]")).click();
	  driver.findElement(By.xpath("//input[@name='loginfmt']"))
	  .sendKeys("nishanth.jakkula@outlook.com"+Keys.ENTER);
	  
	  Thread.sleep(5000);
	  
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("123hellpw"+Keys.ENTER);
	  
	  
	  
	  
	  
	  

	

		
		
	}

}
