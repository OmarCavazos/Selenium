import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

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
        
        Thread.sleep(1000);
        //Select Passengers Dropdown 
        driver.findElement(By.id("divpaxinfo")).click();

        //Loop to select 5 adults
        int i=0;
        while(i<4) {        	
        	//Select +1 Adult
        	driver.findElement(By.id("hrefIncAdt")).click();                    
            i++;
        }
        
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        
        //Click on Done
        driver.findElement(By.id("btnclosepaxoption")).click();
        
        driver.close();
        
        
	}

}
