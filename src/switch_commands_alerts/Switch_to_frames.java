package switch_commands_alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Switch_to_frames 
{

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.cleartrip.com/account/trips");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//driver.switchTo().frame("modal_window");
		//WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		//email.sendKeys("nishu@123");
		//WebElement tripid=driver.findElement(By.id("tripidSecond"));
		//tripid.sendKeys("1994");
		
		//driver.switchTo().defaultContent();
		//WebElement home=driver.findElement(By.xpath("//a[@title='Home']"));
		//home.click();
		
		
		
		

	}

}
