package datix_Pageclasses;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import datix_TestBase.Datix_Base;

public class Datix_landingpage extends Datix_Base {
	
	@FindBy(xpath="//img[@class='logo-info']")
	WebElement title;
	@FindBy(xpath = "//h2[@translate='WELCOME_PAGE.TITLE']")
	WebElement pageheader;	

public Datix_landingpage() {
	
	PageFactory.initElements(driver, this);
	}

public Datix_Capture_AccessSubModules verifypage() {
	
//title.isDisplayed();
pageheader.isDisplayed();
String title= driver.getTitle();
System.out.println(title);
//assertEquals(title, "DCIQ");
return new Datix_Capture_AccessSubModules();
}








}



	