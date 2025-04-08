package eCommerce;

import java.lang.reflect.Array;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.jar.Attributes.Name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class addItems {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//declare variables
		String[] itemsNeeded = {"Cucumber", "Brocolli", "Tomato", "Beetroot"};
		int j=0;
		
		//webdriver.chrome.Driver
		WebDriver driver = new FirefoxDriver();
		
        // Maximize the browser window
        driver.manage().window().maximize();
        
        //wait time for loading page
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
        //Open URL
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        
        
        //find all the items by name 
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));        
        
        //find an specific item from array itemsNeeded using a loop
        for (int i = 0; i < products.size(); i++)
        {
        	
        	//format it to get vegetable name
        	String[] name = products.get(i).getText().split("-");
        	//remove blank spaces
        	String formmattedName = name[0].trim();
        	
        	//check whether name you extracted is present in array        	

        	//convert array into array list for easy search
        	List itemsNeededList = Arrays.asList(itemsNeeded);
        	
        	
        	
        	if (itemsNeededList.contains(formmattedName))
        	{
        		j++;        	
        		//click on Add to Cart
				driver.findElements(By.xpath("//div[@class=\'product-action\']")).get(i).click();
				System.out.println(formmattedName);
				if (j==itemsNeeded.length) {
					break;
				}
					
			}
		}
        
        //driver.close();      
        

	}

}
