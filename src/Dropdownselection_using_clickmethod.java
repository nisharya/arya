import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdownselection_using_clickmethod 
{

	public static void main(String[] args) 
	{
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("http://facebook.com/reg");
		driver.manage().window();
		
		driver.findElement(By.id("day")).findElement(By.xpath("//option[@value='6'][contains(.,'6')]")).click();
		driver.findElement(By.xpath("//option[@value='6'][contains(.,'Jun')]")).click();
		driver.findElement(By.xpath("//option[@value='2015'][contains(.,'2015')]")).click();
		


	}

}
