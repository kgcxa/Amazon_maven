package Module1_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class profileName 
{
   @FindBy(xpath="(//i[@class='a-icon a-icon-arrow'])[1]") WebElement Kartik;
   @FindBy(xpath="//h1[@id='profile-name']") WebElement Profilename;
   WebDriver driver1;
   
   public profileName(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
	   driver1=driver;
   }
   
   public void ProfileName()
   {
	   Kartik.click();
   }
   public String GetName()
   {
	   String actname=Profilename.getText();
	   return actname;
   }
}
