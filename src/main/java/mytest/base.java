package mytest;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.core.util.FileUtils;
import org.apache.logging.log4j.util.PropertySource.Util;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.internal.Utils;

import sun.net.ftp.FtpDirEntry.Type;

public class base {
	
	
	public static WebDriver driver;
	public Properties prop;
	
	public WebDriver initializebrowser() throws IOException {
	
		 prop=new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\PAKSR\\Framework\\src\\main\\java\\source\\browser.properties");
	    prop.load(fis);
    
    
   String browserName= prop.getProperty("browser");
 
  
    if(browserName.equals("chrome"))
    {
    	   System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver_win32 (1)\\chromedriver.exe");
   	        driver= new ChromeDriver();
    }
    else if(browserName.equals("firefox"))
    {
    	System.setProperty("webdriver.gecko.driver", "C:\\work\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		 driver= new FirefoxDriver();
    }
   
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    return driver;
    

}
	
public void getScreenshot(String result) throws IOException {
	// TODO Auto-generated method stub
	TakesScreenshot scrShot =((TakesScreenshot)driver);

	File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	
	File DestFile=new File("C:\\Users\\PAKSR\\Desktop\\"+result+"screenshot.jpg");
	
	 FileHandler.copy(SrcFile, DestFile);
}
		
}