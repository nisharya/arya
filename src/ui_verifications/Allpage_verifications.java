package ui_verifications;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Allpage_verifications
{

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://outlook.com");
		driver.manage().window().maximize();
		
		String pagetitle=driver.getTitle();
		System.out.println("current pagetitle is"+pagetitle);
		
		String pageurl=driver.getCurrentUrl();
		System.out.println("current pageurl is"+pageurl);
		
		String windowid=driver.getWindowHandle();
		System.out.println("current window is"+windowid);
		
		String pagesource=driver.getPageSource();
		System.out.println("current pagesource is"+pagesource);
		
		driver.close();
	}

}
