package Module1_pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountAndList 
{
	 @FindBy(xpath="//a[@id='nav-link-accountList']") WebElement AccountandList;
	 @FindBy(xpath="//span[text()='Your Account']") WebElement YourAccount;
	 WebDriver driver1;
	 public AccountAndList(WebDriver driver)
	 {
	    	PageFactory.initElements(driver, this);
	    	driver1=driver;
	 }
	 public void Moveto()
	 {
			Actions move=new Actions(driver1);
			move.moveToElement(AccountandList).perform();
	 }
     public void Click() 
     {
		 YourAccount.click();	
	 }
     public void Scroll()
	 {
	       ((JavascriptExecutor)driver1).executeScript("window.scrollBy(0,600)");	
	 } 
}
