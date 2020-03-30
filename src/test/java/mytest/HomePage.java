package mytest;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import mytest.base;

public class HomePage extends base{
	
	private static Logger log =LogManager.getLogger(HomePage.class.getName());

	@BeforeTest
	public void initialize() throws IOException {
		driver=initializebrowser();
		log.info("Driver is initialized");
		
	}
	
	@Test(dataProvider="getdata")
	
	public void startingbrowser(String username, String password, String text) throws IOException
	{
		driver.get(prop.getProperty("url"));
		log.info("Now hitting qa click academy");
		Landingpage lg= new Landingpage(driver);
	
			lg.Login.click();
			log.debug("button is click successfully");
		loginpage lp= new loginpage(driver);
		lp.Email.sendKeys(username);
		lp.Password.sendKeys(password);
		lp.loginbutton.click();
		log.info(text);	
	}
	
	@DataProvider
	public Object[][] getdata() {
		
		Object[][] data= new Object[2][3];
		
		data[0][0]="restricteduser@gmail.com";
		data[0][1]="12345";
		data[0][2]="this is retricted user";
		
		data[1][0]="nonrestricteduser@gmail.com";
		data[1][1]="34567";
		data[1][2]="this is non restricted user";
		
		return data;
				
				}
	  @AfterTest
	   public void teardown() {
		   driver.close();
		   driver=null;
	   }
}
