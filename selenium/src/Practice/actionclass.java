package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class actionclass
{
	public static void main(String[] args) throws InterruptedException 
	{
    System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
    WebDriver driver=new FirefoxDriver();
     driver.get("http://flipkart.com");
    WebElement tt = driver.findElement(By.xpath("//a[.='Login']"));
      Actions act = new Actions(driver);
      act.moveToElement(tt);
      
    
    

}
}
