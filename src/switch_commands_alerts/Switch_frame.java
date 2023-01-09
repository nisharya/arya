package switch_commands_alerts;

import java.sql.Driver;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Switch_frame 
{

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//i[@id='i-icon-profile']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//li[@id='signInLink']")).click();
		Thread.sleep(5000);
		
		WebElement parent=driver.findElement(By.xpath("(//iframe[contains(@class,'modalIframe')])[2]"));
		driver.switchTo().frame(parent);
		WebElement child=driver.findElement(By.xpath("//iframe[contains(@title,'Sign in with Google Button')]"));
		driver.switchTo().frame(child);
		WebElement signin=driver.findElement(By.xpath("(//span[contains(.,'Sign in with Google')])[1]"));
		signin.click();
		Thread.sleep(5000);
		
		Set<String> allwindowids=driver.getWindowHandles();
		Iterator<String> itr=allwindowids.iterator();
		
		String win1=itr.next();
		String win2=itr.next();
		
		driver.switchTo().window(win2).close();
		Thread.sleep(5000);
		driver.switchTo().window(win1);
		Thread.sleep(5000);
		driver.switchTo().parentFrame();
		
		WebElement close=driver.findElement(By.xpath("(//i[@class='icon-close'])[2]"));
		close.click();
		Thread.sleep(5000);
		
	
		
		
		

	}

}
