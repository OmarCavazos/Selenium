import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//webdriver.chrome.Driver
		WebDriver driver = new FirefoxDriver();
		
        // Maximize the browser window
        driver.manage().window().maximize();
        
        //wait time for loading page
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
        //Open URL
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");        
        Thread.sleep(1000);
                
        //Select FROM Dropdown
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='BLR']")).click();        
        Thread.sleep(1000);                
        
        //Select TO Bengaluru from second dropdown list        
        //driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

        //Same as previous line but with absolute path
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();
        
        //Select Depart Date
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();
        
        
        //System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
        
        //Check One Way checkbox
        System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style"));
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();        
        System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style"));

        //Asserts the attribute of Return Date is Enabled 
        if(driver.findElement(By.id("Div1")).getDomAttribute("style").contains("1"))
        {
        	System.out.println("It's Enabled");
        	Assert.assertTrue(true);
        }
        else
        {
        	Assert.assertTrue(false);
        }
        
        
        
        
        driver.close();
        
        
	}

}