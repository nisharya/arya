package wait_commands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waitfor_pagetitle
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.titleIs("Instagram"));
		System.out.println("title verified");
		
		WebElement signup= driver.findElement(By.xpath("//span[contains(.,'Sign up')]"));
		signup.click();
		
		new WebDriverWait(driver,Duration.ofSeconds(20)).until(ExpectedConditions.titleContains("Sign up"));
		System.out.println("test verified");
		
	}

}
