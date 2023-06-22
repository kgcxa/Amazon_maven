package LibraryFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class uitility 
{
	public static String GetData(int RowIndex, int CellIndex) throws EncryptedDocumentException, IOException
	{
       FileInputStream file=new FileInputStream("E:\\Software testing\\Amazon_maven\\TestData\\automation data.xlsx");
       Sheet sh=WorkbookFactory.create(file).getSheet("amz");
       String value=sh.getRow(RowIndex).getCell(CellIndex).getStringCellValue();
       return value; 
	}
	
	public static void TakeScreeenShot(WebDriver driver, int TCID) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("E:\\Software testing\\Amazon_maven\\FailedTCScreenShot\\TestCaseID"+TCID+".jpg");
		FileHandler.copy(src, dest);
		
	}
	
	 public static String getpfdata(String key) throws IOException 
	 {
         FileInputStream file=new FileInputStream("E:\\Software testing\\Amazon_maven\\PropertyFile.properties");
         Properties p=new Properties();
         p.load(file);
         String value=p.getProperty(key);
         return value;
	 }
}