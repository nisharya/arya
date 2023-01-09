package javascript_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Disable_to_enable {

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		 JavascriptExecutor js=((JavascriptExecutor)driver);
		 WebElement login=driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
		 js.executeScript("arguments[0].removeAttribute('disabled')", login);
		 js.executeScript("arguments[0].click()", login);
				

	}

}
