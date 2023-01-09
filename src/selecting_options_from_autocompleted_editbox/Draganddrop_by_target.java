package selecting_options_from_autocompleted_editbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Draganddrop_by_target 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://www.hdfcbank.com/personal/tools-and-calculators/personal-loan-calculator");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(3000);
		 WebElement scrollbutton=driver.findElement(By.xpath("//div[contains(@class,'rangeslider__handle')])[1]"));
		 new Actions(driver).dragAndDropBy(scrollbutton,100,0).perform();
		 Thread.sleep(2000);
		 WebElement scrollbutton1=driver.findElement(By.xpath("//div[contains(@class,'rangeslider__handle')])[2]"));
		 new Actions(driver).dragAndDropBy(scrollbutton1, -100,0).perform();
	}
	

}
