package selecting_options_from_autocompleted_editbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dare_picker 
{

	public static void main(String[] args) 
	{
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//span[contains(.,'From')]")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("hyd");
		driver.findElement(By.xpath("//p[contains(.,'Hyderabad, India')]")).click();
		
		
		
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("bom");
		driver.findElement(By.xpath("(//p[contains(.,'Mumbai, India')])[1]")).click();
		
		
		driver.findElement(By.xpath("//div[@class='dateInnerCell'][contains(.,'28₹ 4,687')]")).click();
		 
		
		
		
		
		
		

	}

}
