package wrapping_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Working_with_link {

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("http://instagram.com");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Locations")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("India")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("FortArea")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/explore/locations/1038107002956124/mumbai-cst/']")).click();
		driver.findElement(By.partialLinkText("Gateway of India")).click();
	}
	

}
