package Module1_login;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import LibraryFiles.BaseClass;
import LibraryFiles.uitility;
import Module1_pom.AccountAndList;
import Module1_pom.Entermail;
import Module1_pom.Login;
import Module1_pom.Password;
import Module1_pom.profile;
import Module1_pom.profileName;

public class TestScript extends BaseClass 
{
	Login login;
	Entermail mail;
	AccountAndList account;
	Password Psw;
	profile Profile;
	profileName name;
	int TCID;
		
	@BeforeClass
	public void browserinitililzation() throws IOException
	{
		initializeBrowser();
		login=new Login(driver);
		mail=new Entermail(driver);
		account=new AccountAndList(driver);
		Psw=new Password(driver);
		Profile=new profile(driver);
		name=new profileName(driver);
	}
	@BeforeMethod
	public void LoginAmz() throws EncryptedDocumentException, IOException, InterruptedException
	{
		login.Moveto();
		login.SignIn();
		mail.MobNo(uitility.getpfdata("EMAIL"));
		mail.Continue();
		Psw.EnterPsw(uitility.getpfdata("password"));
		Psw.SignClick();
		
	}
    @Test
    public void TC1() throws InterruptedException, IOException
    {
    	TCID=01;
    	account.Moveto();
    	account.Click();
    	account.Scroll();
		Thread.sleep(2000);
		Profile.ManageYourProfile();
		name.ProfileName();
		
	    String actResult=name.GetName();
	    String expResult=uitility.GetData(0, 2);
	    Assert.assertEquals(actResult, expResult, "Passed both results are same");
    }
    
    @AfterMethod
    public void Screenshot(ITestResult s1) throws IOException
    {
    	if(s1.getStatus()==ITestResult.FAILURE)
    	{
    		uitility.TakeScreeenShot(driver, 01);
    	}
    }
}
