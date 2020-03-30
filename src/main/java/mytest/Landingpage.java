package mytest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Landingpage  {

	
	WebDriver driver;
	public Landingpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//button[contains(text
    //button[contains(text(),'NO THANKS')] 

	
	
	By alert=By.xpath("//button[contains(text(),'NO THANKS')]");
		
	
	@FindBy(linkText="Login")
	public
	WebElement Login;
	
	@FindBy(xpath="//div[@class=\"text-center\"]/h2")
	WebElement title;
	
	@FindBy(css="div.navbar.navbar-default.navbar-static-top")
	WebElement topbar;
	
	

	public WebElement Login()
	{
		return Login;
	}
	
	public List<WebElement> alert()
	{
		return driver.findElements(alert);
	}
	
	public WebElement getalert() {
		return driver.findElement(alert);
	}
	
	public WebElement gettitle() {
		
		return title;
	}
	
	public WebElement topbar() {
		
		return topbar;
	}
	
}
