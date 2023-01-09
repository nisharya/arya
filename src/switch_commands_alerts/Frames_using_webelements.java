package switch_commands_alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames_using_webelements
{

	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/account/trips");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement frameelement=driver.findElement(By.xpath("//iframe[@class='spinnerMedium']"));
		driver.switchTo().frame(frameelement);
		
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("nishu@gmail.com");
		
		WebElement tripid=driver.findElement(By.id("tripidSecond"));
		tripid.sendKeys("1994");
		
		driver.switchTo().defaultContent();
		WebElement home=driver.findElement(By.xpath("//a[@title='Home']"));
		home.click();
		
		
		
		
		

	}

}
