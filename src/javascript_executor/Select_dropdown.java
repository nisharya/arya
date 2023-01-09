package javascript_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Select_dropdown 
{

	public static void main(String[] args) 
	{
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://www.facebook.com/reg/");
		driver.manage().window();
		 
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		WebElement Daydropdown=driver.findElement(By.xpath("//select[contains(@id,'day')]"));
		js.executeScript("arguments[0].value='24'", Daydropdown);
		
		WebElement Monthdropdown=driver.findElement(By.xpath("//select[contains(@id,'month')]"));
		js.executeScript("arguments[0].value='6'", Monthdropdown);
		
		

	}

}
