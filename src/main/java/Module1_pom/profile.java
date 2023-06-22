package Module1_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class profile 
{
   @FindBy(xpath="//a[text()='Manage Your Profiles']") WebElement manageYourProfile;
   public profile(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   
   public void ManageYourProfile()
   {
	   manageYourProfile.click();
   }
   
}
