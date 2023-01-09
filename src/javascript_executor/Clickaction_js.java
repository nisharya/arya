package javascript_executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Clickaction_js 
{

	public static void main(String[] args)
	{
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://www.outlook.com/");
		driver.manage().window();
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		WebElement SignIn=driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]"));
		js.executeScript("arguments[0].click()",SignIn );

	}

}
