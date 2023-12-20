package datix_Pageclasses;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




import datix_TestBase.Datix_Base;
import datix_utilities.Datix_Util;

public class Datix_Inc_AddaNewIncidents extends Datix_Base{

	Datix_Util U;
	String sheet="Incidents";
	
	//this is for incidents field 
	@FindBy(xpath = "//span[contains(.,'Add a new incident')]")
	WebElement Add_a_new_incidents;
	
	//this is for Name field
	@FindBy(xpath = "//input[@id='inc_name']")
	WebElement Name;
	
	//this is for approval field
	@FindBy(xpath = "//input [@id=\"rep_approved_title\"]")
	WebElement Approvalstatus;
	
	//this is for handler field
	@FindBy(xpath="//input [@id=\"inc_mgr_title\"]")
	WebElement Handler;
	
	
	@FindBy(xpath="//span[text()='Name and reference']")
	WebElement leftpanel;
	
	
	@FindBy(xpath = "//input[@id=\"inc_head_title\"]")
	WebElement Manager ;
	
	
	
	
	
	public Datix_Inc_AddaNewIncidents() {
		
		PageFactory.initElements(driver, this);
		U=new Datix_Util("C:\\Users\\SaiKiran\\Selenium\\TestData.xlsx");
		 }
	
	
public void clickonNewInc() {
	 Add_a_new_incidents.click();
}


public void Nameandrefrence(int Row, String name, String approvalstatus, String handler){
		
Name.sendKeys(U.getCellData(sheet, name, Row));
Approvalstatus.sendKeys(U.getCellData(sheet, approvalstatus, Row));
Handler.sendKeys(U.getCellData(sheet, handler, Row));
	 }	
public void Nameandrefrence(int Row, String name, String manager) throws IOException{
	
Name.sendKeys(U.getCellData(sheet, name, Row));
Manager.sendKeys(U.getCellData(sheet, manager, Row));
 File f= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
  FileUtils.copyFile(f, new File(""));

	 }
	}

