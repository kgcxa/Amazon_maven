package Module1_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Password 
{
    @FindBy(xpath="//input[@id='ap_password']") WebElement PassWord;
    @FindBy(xpath="//input[@id='signInSubmit']") WebElement SignIn;
    
    public Password(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    public void EnterPsw(String password)
    {
    	PassWord.sendKeys(password);
    }
    
    public void SignClick()
    {
    	SignIn.click();
    }
}
