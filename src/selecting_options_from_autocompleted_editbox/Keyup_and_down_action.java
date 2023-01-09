package selecting_options_from_autocompleted_editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyup_and_down_action 
{

	public static void main(String[] args)
	{
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://jqueryui.com/resources/demos/selectable/default.html");
		driver.manage().window().maximize();
		
		new Actions(driver).keyDown(Keys.CONTROL).perform();
		
		driver.findElement(By.xpath("//li[contains(.,'Item 2')]")).click();
		driver.findElement(By.xpath("//li[contains(.,'Item 4')]")).click();
		driver.findElement(By.xpath("//li[contains(.,'Item 6')]")).click();
		new Actions(driver).keyUp(Keys.CONTROL).perform();
	}

}
