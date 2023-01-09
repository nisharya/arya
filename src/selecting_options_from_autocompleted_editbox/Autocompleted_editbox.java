package selecting_options_from_autocompleted_editbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autocompleted_editbox 
{
	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://near-me.hdfcbank.com/branch-atm-locator/");
		driver.manage().window();
		Thread.sleep(8000);
		
		WebElement searchbox=driver.findElement(By.id("OutletSearch"));
		searchbox.sendKeys("bengaluru");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//li[@class='suggestions-list active']")).click();
	}

}
