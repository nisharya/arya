package pageobjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class System_users
{
	public WebDriver driver;
	
	public System_users(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
		
		@FindBy(xpath = "//button[contains(.,'Add')]") 
		public WebElement  add;

		@FindBy(xpath = "//input[@class='oxd-input oxd-input--focus']")
		public WebElement  selectuser;

		@FindBy(xpath = "(//i[contains(@class,'oxd-icon bi-trash')])[1]")
		public WebElement  deleteuser;

		@FindBy(xpath = "(//i[@class='oxd-icon bi-pencil-fill'])[1]")
		public WebElement edituser;
		
		public void clickaddbutton()
		{
			add.click();
		}
		
		public void selectuser_fromtable() 
		{
			selectuser.click();
		}
		public void deleteuserbutton()
		{
			deleteuser.click();
		}
		public void edituserbutton()
		{
		edituser.click();
		}



	
	
	

}
