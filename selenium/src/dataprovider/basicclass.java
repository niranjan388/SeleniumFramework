package dataprovider;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class basicclass
{
	public WebDriver  driver;
	WebDriverWait wait;
	
 @BeforeMethod()
 public void basic()
 {
	 System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	 driver=new FirefoxDriver();
	 wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	 driver.get("http://www.amazon.com");
	 }
 @AfterMethod()
 
	 public void end()
	 {
	 driver.close();
	 
	 }	 
 
 }

