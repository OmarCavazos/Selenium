import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoSuggestive {

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
		        
		        //Write characters on Country Search field 
		        driver.findElement(By.id("autosuggest")).sendKeys("me");
		        Thread.sleep(1500);

		        
		        //Select India option from list
		        List <WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		        
		        for(WebElement option: options)
		        {
		        	if (option.getText().equalsIgnoreCase("Mexico"))
		        	{
		        		option.click();
		        		break;
		        	}
		        }
		
	}

}
