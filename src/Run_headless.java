import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Run_headless
{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions options=new ChromeOptions();
		options.setHeadless(true);
		options.addArguments("headless");
		
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\nisha\\Downloads\\chromedriver_win32.zip\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		System.out.println(driver.getTitle());
		WebElement element=driver.findElement(By.id("email"));
		element.sendKeys("8686991145");
		System.out.println("enter email succesful");
		
	}

}
