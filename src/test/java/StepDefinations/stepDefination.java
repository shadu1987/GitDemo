package StepDefinations;




	import cucumber.api.PendingException;
	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.When;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.And;
	import cucumber.api.junit.Cucumber;
import mytest.Landingpage;
import mytest.base;
import mytest.loginpage;

import org.junit.runner.RunWith;

	@RunWith(Cucumber.class)
	public class stepDefination extends base {

		@Given("^Open the Browser$")
		public void open_the_Browser() throws Throwable {
			driver=initializebrowser();
		}

		@Given("^Hit the url \"([^\"]*)\"$")
		public void hit_the_url(String arg1) throws Throwable {
			driver.get(arg1);
		}

		@Given("^Click on Login link landed on login home page$")
		public void click_on_Login_link_landed_on_login_home_page() throws Throwable {
			Landingpage lg= new Landingpage(driver);
			if(lg.alert().size()>0)
			{
				lg.getalert().click();
			}
			lg.Login.click();
		}

	    @When("^User enter the username (.+) and password (.+) and sign in$")
	    public void user_enter_the_username_and_password_and_sign_in(String username, String password) throws Throwable {
	    	loginpage lp= new loginpage(driver);
	    	lp.Email.sendKeys(username);
	    	lp.Password.sendKeys(password);
	    	lp.loginbutton().click();
	    }



	

		@Then("^Verify user logged in successfully$")
		public void verify_user_logged_in_successfully() throws Throwable {
		   
}
		  @And("^close the Browser$")
		    public void close_the_browser() throws Throwable {
		        driver.close();
		    }
	}
