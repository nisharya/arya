import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames_using_indexnumber 
{

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/info/redcare");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.switchTo().frame(1);
		WebElement mobilenumber=driver.findElement(By.xpath("//input[@id='mobileNoInp']"));
		mobilenumber.sendKeys("12345");

	}

}
