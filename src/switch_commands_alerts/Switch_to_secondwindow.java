package switch_commands_alerts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Switch_to_secondwindow
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement Meta=driver.findElement(By.linkText("Meta"));
		Meta.click();
		
		Set<String> allwindowids=driver.getWindowHandles();
		Iterator<String> itr=allwindowids.iterator();
		
		String win1=itr.next();
		String win2=itr.next();
		
		System.out.println("before switch window title is"+driver.getTitle());
		driver.switchTo().window(win2);
		Thread.sleep(5000);
		System.out.println("after switch window title is"+driver.getTitle());
		driver.switchTo().window(win1);
		Thread.sleep(5000);
		System.out.println("main window title is"+driver.getTitle());
		
		
		
		


	}
	

}
