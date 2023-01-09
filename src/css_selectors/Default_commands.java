package css_selectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Default_commands
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//driver.findElement(By.cssSelector("#email")).sendKeys("nishu123@gmail.com");id
		//driver.findElement(By.cssSelector("input#email")).sendKeys("8297528163");tagname and id
		//driver.findElement(By.cssSelector("input#email.inputtext")).sendKeys("8297528163");tagname,id and class name
		//driver.findElement(By.cssSelector("._9npi")).sendKeys("nishu123@gmail.com");unique class name
		

	}

}
