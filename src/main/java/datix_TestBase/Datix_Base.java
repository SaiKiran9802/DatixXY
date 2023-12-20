package datix_TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Datix_Base {

	public static Properties prop;
	public static WebDriver driver;
	
	public Datix_Base() {
		try {
			prop = new Properties();
			FileInputStream fi = new FileInputStream("src/main/java/datix_properties/config.properties");
			prop.load(fi);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void intalization() {
		System.out.println(prop.getProperty("URL"));
		String browser=prop.getProperty("Browser");
		System.out.println(browser);
		
		if(browser.equals("chrome")){
			System.out.println("chromloop");
	    //System.setProperty("webdriver.chrome.driver", "Users/SaiKiran/Downloads/chromedriver");	
                 driver=new ChromeDriver();	
			
		}else if (browser=="firefox") {
	             driver= new FirefoxDriver();
		}
		System.out.println("url access");
		String url= prop.getProperty("URL");
		
    driver.get(url);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();


	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
