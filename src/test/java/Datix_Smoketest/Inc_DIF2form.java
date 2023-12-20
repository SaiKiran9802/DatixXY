package Datix_Smoketest;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.openxml4j.exceptions.OpenXML4JException;


import datix_Pageclasses.Datix_Capture_AccessSubModules;
import datix_Pageclasses.Datix_Inc_AddaNewIncidents;
import datix_Pageclasses.Datix_Login;
import datix_Pageclasses.Datix_landingpage;
import datix_TestBase.Datix_Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Inc_DIF2form extends Datix_Base {
	
	public Inc_DIF2form() throws IOException {
		super();
	}
	
	Datix_Login lin;
	Datix_landingpage lng;
	Datix_Capture_AccessSubModules modules;
	Datix_Inc_AddaNewIncidents addnewinc;
	
	@Given("DIF2 form")
	public void dif2_form() throws Exception, IOException {
	    intalization();	
	    lin= new Datix_Login();
		lng=lin.login("admin@datix.qa", "XNz6z6yPCfy7MYrgOm8nSUXPWYNjCE374QCqbwU");
		modules=lng.verifypage();
		modules.accesscaputure();
		addnewinc=modules.accessincidents();
		addnewinc.clickonNewInc();
		
	}
	@When("User fills {string} {string} {string}")
	public void user_fills_the_deatils(String name, String aprstatus, String handler) {
		int Row=2;
		addnewinc.Nameandrefrence(Row,  name, aprstatus, handler);
		//addnewinc.Nameandrefrence(sheet, Row, leftpanel, nme, aprstatus);
		}
	@Then("form should be save without any error message")
	public void form_should_be_save_without_any_error_message() {
		driver.quit();
	}
	
	@When("User fills {string} {string}")
	public void User_access_fields(String name,String Manager) throws IOException {
		
		addnewinc.Nameandrefrence(2, name,Manager);
		DateFormat d=new SimpleDateFormat("dd-mm");
		Date date= new Date();
		String str= d.format(date);
		
	}
	

	
	
}
