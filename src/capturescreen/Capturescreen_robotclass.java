package capturescreen;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Capturescreen_robotclass 
{

	public static void main(String[] args) throws InterruptedException, AWTException, IOException 
	{
	
		WebDriver driver=WebDriverManager.chromedriver().avoidShutdownHook().create();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		Robot robot=new Robot();
		BufferedImage image=robot.createScreenCapture(new Rectangle(new Dimension(800,600)));
		ImageIO.write(image, "png", new File("C:\\Backup folder selenium\\My Project\\Nishanth P1\\screens\\alert.png"));
		
		
		
	}

}
