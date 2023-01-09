package switch_commands_alerts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SWitchto_required_window {

	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		String mainwindowid=driver.getWindowHandle();
		
		WebElement Meta=driver.findElement(By.linkText("Meta"));
		Meta.click();
		Thread.sleep(3000);
		
		WebElement About=driver.findElement(By.linkText("Meta"));
		About.click();
		Thread.sleep(3000);
		
		WebElement Blog=driver.findElement(By.linkText("Meta"));
		Blog.click();
		Thread.sleep(3000);
		
		System.out.println("before switch window title is"+driver.getTitle());
		
		Set<String>allwindowsids=driver.getWindowHandles();
		
		for (String eachwindowid : allwindowsids)
		{
			String pagetitle=driver.switchTo().window(eachwindowid).getTitle();
			if (pagetitle.contains("capture,create"))
			{
				break;
				
				
			}
			
		}
		
		System.out.println("after switch window title is"+driver.getTitle());
		
		driver.switchTo().window(mainwindowid);
		System.out.println("after switch to main window"+driver.getTitle());
		
		
			
		
		
		
		
		
		
		
		
		

	}

}
