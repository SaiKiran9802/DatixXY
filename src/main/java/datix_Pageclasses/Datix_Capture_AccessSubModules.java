package datix_Pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import datix_TestBase.Datix_Base;
import io.cucumber.messages.types.Duration;

public class Datix_Capture_AccessSubModules extends Datix_Base {
	
	
	@FindBy(xpath = "//li//a//span[text()='Capture']")
	WebElement accesscaptue;
	@FindBy(xpath = "//button[text()='Incidents']")
	WebElement Incidents;
	@FindBy(xpath = "//h1[contains(.,'Incidents')]")
	WebElement verifyincids;
	@FindBy(xpath = "//button[contains(.,'Claims')]")
	WebElement claims;
	@FindBy(xpath = "//h1[contains(.,'Claims')]")
	WebElement verifyclaims;
	@FindBy(xpath = "//button[contains(.,'Mortality Review')]")
	WebElement Mortality;
	@FindBy(xpath = "//h1[contains(.,'Mortality Review')]")
	WebElement verifymortality;
	@FindBy(xpath = "//button[contains(.,'Feedback')]")
	WebElement Feedback;
	@FindBy(xpath = "//h1[contains(.,'Feedback')]")
	WebElement verifyFeedback;
	
	

public Datix_Capture_AccessSubModules() {

	PageFactory.initElements(driver, this);
	
}

public void accesscaputure() {
	Actions a= new Actions(driver);
	WebDriverWait w= new WebDriverWait(driver, java.time.Duration.ofMinutes(30));
	
	
	    //driver.navigate().refresh();
	    //driver.navigate().to(driver.getCurrentUrl());
	    w.until(ExpectedConditions.visibilityOf(accesscaptue));
	   // a.moveToElement(accesscaptue);
	    a.click(accesscaptue);
		accesscaptue.click();
		Incidents.isDisplayed();
		claims.isDisplayed();
		Mortality.isDisplayed();
		Feedback.isDisplayed();		
	}
public Datix_Inc_AddaNewIncidents accessincidents() {
		Incidents.click();
        verifyincids.isDisplayed();
        return new Datix_Inc_AddaNewIncidents();
		}
public void accessclaims() {
	claims.click();
	verifyclaims.isDisplayed();
	}
public void accessfeedback() {
	Feedback.click();
	verifyFeedback.isDisplayed();
	}

public void accessmortality() {
	Mortality.click();
	verifymortality.isDisplayed();
	}

	
	
	
	
	

}
