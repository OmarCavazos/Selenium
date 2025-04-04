import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
//TestNG testing Framework

public class UpdatedDropdown {

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
        
        //Assert checkbox is not selected Else stop
        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());        
        
        
        //Mark Senior Citizen checkbox and validate
        //System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        
        
        //Count all the checkboxes on the page
        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());        
        
        
        //Select Passengers Dropdown 
        driver.findElement(By.id("divpaxinfo")).click();

        //Loop to select 5 adults
        int i=0;
        while(i<4) {        	
        	//Select +1 Adult
        	driver.findElement(By.id("hrefIncAdt")).click();                    
            i++;
        }
        
        
        //Make sure 5 adult is selected
        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        
        //Click on Done
        driver.findElement(By.id("btnclosepaxoption")).click();
        
        
        driver.close();
        
        
	}

}
