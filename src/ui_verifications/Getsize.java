package ui_verifications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Getsize
{

	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement contactsales=driver.findElement(By.xpath("(//button[contains(.,'Contact Sales')])[2]"));
		int obj_height=contactsales.getSize().getHeight();
		int obj_width=contactsales.getSize().getWidth();
		
		System.out.println("height"+obj_height);
		System.out.println("width"+obj_width);
		

	}

}
