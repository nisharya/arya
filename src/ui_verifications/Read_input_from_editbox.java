package ui_verifications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Read_input_from_editbox {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("nishu");
		Thread.sleep(4000);
		
		String runtime_value=email.getAttribute("value");
		System.out.println("runtime_value");

	}

}
