package selecting_options_from_autocompleted_editbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sendkeys_example 
{

	public static void main(String[] args) 
	{
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement origin_textbox=driver.findElement(By.xpath("//input[@id='fsc-origin-search']"));
		new Actions(driver).click(origin_textbox).sendKeys(Keys.BACK_SPACE).pause(2000).sendKeys("HYD").pause(2000).sendKeys(Keys.ARROW_DOWN).pause(2000).sendKeys(Keys.ENTER).perform();
		
		

	}

}

