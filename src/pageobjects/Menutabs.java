package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Menutabs 
{
	WebDriver driver;
	public Menutabs(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;	
	}
	
	@FindBy(xpath = "//a[contains(.,'Admin')]")
	public WebElement  admin;

	@FindBy(xpath = "//a[contains(.,'PIM')]")
	public WebElement  pIM;

	@FindBy(xpath = "//span[contains(.,'Leave')]")
	public WebElement  leave;

	@FindBy(xpath = "//span[contains(.,'Time')]")
	public WebElement  time;

	@FindBy(xpath = "//span[contains(.,'Recruitment')]")
	public WebElement  recruitment;

	@FindBy(xpath = "//a[contains(.,'My Info')]")
	public WebElement  myInfo;
	
	@FindBy(xpath = "//a[contains(.,'Performance')]")
	public WebElement  performance;

	@FindBy(xpath = "//span[contains(.,'Dashboard')]")
	public WebElement  dashboard;

	@FindBy(xpath = "//span[contains(.,'Directory')]")
	public WebElement  directory;

	@FindBy(xpath = "//span[contains(.,'Maintenance')]")
	public WebElement  maintenance;

	@FindBy(xpath = "//a[contains(.,'Buzz')]")
	public WebElement  buzz;
	
	@FindBy(xpath = "(//frame[contains(.,'Buzz')])")
	public WebElement sampleframe;
	
	public void switchtoframe() 
	{
		driver.switchTo().frame(sampleframe);
		
	}

	
	

	
	

}
