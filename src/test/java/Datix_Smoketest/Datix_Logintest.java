package Datix_Smoketest;

import java.io.IOException;

import datix_Pageclasses.Datix_Login;
import datix_Pageclasses.Datix_landingpage;
import datix_TestBase.Datix_Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Datix_Logintest extends Datix_Base {
	
	public Datix_Logintest() throws IOException {
		super();
	}


	
	Datix_Login lin;
	Datix_landingpage lng;
	

	@Given("user creditails")
	public void user_creditails() {
           intalization();
	}

	@When("domain user is displayed")
	public void domain_user_is_displayed() {
		lin= new Datix_Login();
		lng=lin.login(prop.getProperty("Username"), prop.getProperty("Password"));		
	}
	@Then("user login to the application")
	public void user_login_to_the_application() {

	lng.verifypage();
	driver.quit();
	System.out.println("quite");
}
	



	
	
	
	
	
	
}
