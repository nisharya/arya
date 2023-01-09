import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Download_directory 
{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions options=new ChromeOptions();
		Map<String, Object> prefs=new HashMap<String,Object>();
		prefs.put("download.default_directory", "C:\\Users\\nisha\\Downloads\\ganesh");
		options.setExperimentalOption("prefs", prefs);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(5000);
		
		WebElement element=driver.findElement(By.xpath("(//a[@class='card-link'])[7]"));
		element.click();
		
		

	}

}
