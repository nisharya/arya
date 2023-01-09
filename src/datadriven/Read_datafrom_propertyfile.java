package datadriven;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Read_datafrom_propertyfile {

	public static void main(String[] args) throws Exception {
		String filepath="src//datadriven//input.properties";
		FileInputStream fi=new FileInputStream(filepath);
		System.err.println("file is located");
		
		Properties repository=new Properties();
		repository.load(fi);
		System.out.println("inputdata loaded into repository");
		
		String url=repository.getProperty("application_url");
		System.out.println(url);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get(url);

	}

}
