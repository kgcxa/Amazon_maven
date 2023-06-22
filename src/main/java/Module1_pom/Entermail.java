package Module1_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Entermail 
{
    @FindBy(xpath="//input[@id='ap_email']") WebElement MobNo;
	@FindBy(xpath="//input[@id='continue']") WebElement Continue;
	
	public Entermail(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void MobNo(String Email)
	{
		MobNo.sendKeys(Email);
	}
	
	public void Continue() 
	{
	   Continue.click();	
	}
	
}
