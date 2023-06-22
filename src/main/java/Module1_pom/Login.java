package Module1_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login 
{
    @FindBy(xpath="//a[@id='nav-link-accountList']") WebElement AccountList;
    @FindBy(xpath="(//span[@class='nav-action-inner'])[1]") WebElement signIn;
    WebDriver driver1;
    
    public Login(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    	driver1=driver;
    }
	public void Moveto()
	{
		Actions move=new Actions(driver1);
		move.moveToElement(AccountList).perform();
	}
	public void SignIn() 
	{
	   signIn.click();	
	}
	
	
}
