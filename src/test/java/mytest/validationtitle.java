package mytest;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import mytest.base;

public class validationtitle extends base{

	
	private static Logger log= LogManager.getLogger(validationtitle.class.getName());
	
	 @BeforeTest
	 public void initialize() throws IOException {
			driver=initializebrowser();
			log.info("initialize the browser");
		
	 }


	
	@Test
	public void startingbrowser() throws IOException {
		
	
		driver.get(prop.getProperty("url"));
		log.info("navigate to qaclickacademy website");
		
		Landingpage lg= new Landingpage(driver);
		
        
        Assert.assertEquals(lg.gettitle().getText(), "FEATURED COURSES"); 
       
      
      Assert.assertTrue(lg.topbar.isDisplayed());
      log.info("Successfully validate title");
     
		
	}
	
   @AfterTest
   public void teardown() {
	   driver.close();
	   driver=null;
   }

}
