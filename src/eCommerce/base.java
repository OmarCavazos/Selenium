package eCommerce;

import java.lang.reflect.Array;
import java.security.PublicKey;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.jar.Attributes.Name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub		

        String[] itemsNeeded = {"Cucumber", "Brocolli", "Tomato", "Beetroot", "Beans"};        
		
		//webdriver.chrome.Driver
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
        // Maximize the browser window
        driver.manage().window().maximize();        
        //wait time for loading page
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));        

        
        //Open URL
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");        
        Thread.sleep(1500);
        addItems(driver, itemsNeeded);
        
        //checkout
        driver.findElement(By.cssSelector("img[alt='Cart']")).click();
        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
        
        //enter promo code
        driver.findElement(By.cssSelector("input.promocode")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("button.promoBtn")).click();
        System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());        
        
        
        driver.close();      
        

	}
	
	
    public static void addItems(WebDriver driver, String[] itemsNeeded)
    {
		//declare variables		
		int j=0;
    	
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
    }

}
