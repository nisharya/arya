package ui_verifications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Getrect
{

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		WebElement roundtrip=driver.findElement(By.xpath("//li[contains(.,'Round Trip')]"));
		

		System.out.println(roundtrip.getRect().getX());
		System.out.println(roundtrip.getRect().getY());
		System.out.println(roundtrip.getRect().getHeight());
		System.out.println(roundtrip.getRect().getWidth());
		System.out.println(roundtrip.getRect().getDimension());
		System.out.println(roundtrip.getRect().getPoint());
		
		
		

	}

}
