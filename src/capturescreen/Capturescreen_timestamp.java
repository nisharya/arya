package capturescreen;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Capturescreen_timestamp
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MMM-EEE-dd hh-mm-ss");
		String time=sdf.format(date);
		
		
		WebElement footer_area=driver.findElement(By.xpath("(//div[contains(@class,'abcm')])[7]"));
		File src=footer_area.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("screens\\\\image1."+time+".png"));
		

	}

}
