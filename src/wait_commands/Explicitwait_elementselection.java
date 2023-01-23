package wait_commands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Explicitwait_elementselection {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window();
		
		WebElement female_button=driver.findElement(By.xpath("//input[@value='1']"));
		female_button.click();
	
		try {
			new WebDriverWait(driver, Duration.ofSeconds(30)).
			until(ExpectedConditions.elementSelectionStateToBe(female_button, true));
		} catch (Exception e) {
			e.printStackTrace();
		}
		WebElement male_button=driver.findElement(By.xpath("//input[@value='2']"));
		male_button.click();
		try {
			new WebDriverWait(driver, Duration.ofSeconds(30)).
			until(ExpectedConditions.elementSelectionStateToBe(female_button, false));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
