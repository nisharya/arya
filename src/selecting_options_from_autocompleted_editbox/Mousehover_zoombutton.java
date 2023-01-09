package selecting_options_from_autocompleted_editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mousehover_zoombutton 
{

	public static void main(String[] args) throws InterruptedException
	{
	
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://www.jqueryscript.net/zoom/image-magnifier-on-hover.html");
		driver.manage().window();
		Thread.sleep(10000);
		
		WebElement element=driver.findElement(By.xpath("//a[contains(@title,'Product Image Zoom On Hover - jQuery Zoom.js')]"));
		new Actions(driver).moveToElement(element).pause(3000).click().pause(3000).sendKeys(Keys.ESCAPE).perform();
	}

}
