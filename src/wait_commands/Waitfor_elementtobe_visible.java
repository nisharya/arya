package wait_commands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waitfor_elementtobe_visible
{

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://instagram.com");
		driver.manage().window().maximize();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username"))).sendKeys("nishu");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password"))).sendKeys("nishu123");
		



		
	}

}
