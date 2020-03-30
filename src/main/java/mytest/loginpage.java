package mytest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	
	WebDriver driver;
	public loginpage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//input[@id='user_email']")
	public
	WebElement Email;
	
	@FindBy(css="input#user_password")
	public
	WebElement Password;
	
	@FindBy(css="input.btn.btn-primary.btn-md.login-button")
	WebElement loginbutton;
	
	public WebElement Email() {
		
		return Email;
		
	}
	
	public WebElement Password() {
		
		return Password;
	}
	
	public WebElement loginbutton() {
		
		return loginbutton;
	}
	
	
	
	

}
