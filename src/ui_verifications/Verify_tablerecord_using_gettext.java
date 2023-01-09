package ui_verifications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verify_tablerecord_using_gettext 
{

	private static final String PIM = null;

	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		 WebElement username=driver.findElement(By.xpath("//input[contains(@name,'username')]"));
		 username.sendKeys("Admin");
		 
		 WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
		 password.sendKeys("admin123");
		 
		 WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
		 login.click();
		 Thread.sleep(5000);
		 
		 
	   
		WebElement pimtab= driver.findElement(By.linkText(PIM));
		pimtab.click();
		Thread.sleep(5000);

	}

}
