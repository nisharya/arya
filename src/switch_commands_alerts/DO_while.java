package switch_commands_alerts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DO_while
{

	public static void main(String[] args) throws Exception
	{
		int i=0;
		do {
			System.out.println(i);
			i=i+1;	
		} while (i<10);
		
		int j=100;
		do {
			System.out.println(j);
			j=j-1;
		} while (j<0);
		
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.manage().window().maximize();
		
		boolean tile_status=false;
		int count=0;
		do {
			driver.get("http://instagram.com");
			
			try { 
				new WebDriverWait(driver, Duration.ofSeconds(5))
				.until(ExpectedConditions.titleContains("Facebook"));
				System.out.println("Instagram printed");
				tile_status=true;
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			count=count+1;
			if (count==10)
			{
				throw new Exception("loading failed after 10attempts");
			}
			
		} while (tile_status==false);

	}

}
