package object_identification.classname;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class Identifying_with_classproperty
{

	public static void main(String[] args) throws Exception
	{
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		driver.findElement(By.className("oxd-input")).sendKeys("admin");
		
		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("admin123");
		driver.findElement(By.className("oxd-button")).click();
		Thread.sleep(4000);
		
		List<WebElement> menulist=driver.findElements(By.className("oxd-main-menu-item"));
		for (WebElement webElement : menulist) 
		{
			System.out.println(webElement.getText());
			
		}
		
			
	
			
		
		
		
		
		
		

	}

}
