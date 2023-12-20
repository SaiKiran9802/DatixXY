package datix_Pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import datix_TestBase.Datix_Base;
import net.bytebuddy.asm.Advice.Return;

public class Datix_Login extends Datix_Base{

	@FindBy(xpath = "//a[@href='/auth']")
	WebElement domainuser;
	
	@FindBy(xpath = "(//input[contains(@class,'input-with-glyph')])[1]")
	WebElement usname;
	
	@FindBy(xpath = "(//button[contains(.,'Next')])[1]")
	WebElement nxt;

	@FindBy(xpath = "//input[@placeholder='Enter the password associated with your username']")
	WebElement passwrd;
	@FindBy(xpath = "(//button[contains(.,'Next')])[3]")
	WebElement nxt1;
	
	public Datix_Login() {
		
	PageFactory.initElements(driver, this);
	}
	
	public Datix_landingpage login(String usr, String PWD) {
		
		domainuser.click();
		usname.sendKeys(usr);
		nxt.click();
		passwrd.sendKeys(PWD);
		nxt1.click();
return new Datix_landingpage();
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
