import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sendkeys_with_multiple_options 
{

	public static void main(String[] args) 
	{
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://www.facebook.com/reg");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("firstname")).sendKeys("nishu"+Keys.TAB+"J"+Keys.TAB+"nishu123@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("nishu123@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("nishu456");
		driver.findElement(By.xpath("//select[@id='day']")).sendKeys("21");
		driver.findElement(By.xpath("//select[@id='month']")).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//select[@id='year']")).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).sendKeys(Keys.ARROW_LEFT);
		
		

	}

}
