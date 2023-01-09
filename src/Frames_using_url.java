import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames_using_url 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/info/redcare");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.navigate().to("https://www.redbus.in/login?offerType=Support&defaultSlide=home&isOnlyMobile=false");
		WebElement mobileno=driver.findElement(By.xpath("//input[@id='mobileNoInp']"));
		mobileno.sendKeys("1234567890");
		Thread.sleep(4000);
		driver.navigate().back();
	

	}

}
