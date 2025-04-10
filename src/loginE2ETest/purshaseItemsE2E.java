package loginE2ETest;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class purshaseItemsE2E {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// webdriver.chrome.Driver
		WebDriver driver = new FirefoxDriver();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));		
		String[] itemsNeeded = {"iphone", "Samsung", "Nokia", "Beetroot", "Blackberry"};
		
		// Maximize the browser window
		driver.manage().window().maximize();

		// wait time for loading page
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// Open URL
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");

		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();

		Thread.sleep(1000);

        System.out.println(driver.findElement(By.xpath("//div[@class='modal-dialog modal-confirm']")).getText());
		driver.findElement(By.id("okayBtn")).click();

		Thread.sleep(1000);
		driver.findElement(By.xpath("//select[@class='form-control']/option[@value='consult']")).click();
		
 

		driver.findElement(By.id("terms")).click();

		driver.findElement(By.id("signInBtn")).click();
		//Thread.sleep(3000);
		
		 //addItems is executed
        addItems(driver, itemsNeeded);
		
		driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();

		driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
		
		
		//explicit wait        
        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("label[for='country']")));
		driver.findElement(By.id("country")).sendKeys("Test Street #123");
		
		driver.findElement(By.xpath("//label[@for='checkbox2']")).click();
		
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[value='Purchase']")));
		driver.findElement(By.xpath("//input[@class='btn btn-success btn-lg']")).click();
		
		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
		
	}
	
    public static void addItems(WebDriver driver, String[] itemsNeeded)
    {
		//declare variables		
		int j=0;
    	
    	//find all the items by name 
        List<WebElement> products = driver.findElements(By.xpath("//h4[@class='card-title']"));        
        
        //find an specific item from array itemsNeeded using a loop
        for (int i = 0; i < products.size(); i++)
        {
        	
        	//format it to get vegetable name
        	String[] name = products.get(i).getText().split(" ");
        	//remove blank spaces
        	String formmattedName = name[0].trim();
        	
        	//check whether name you extracted is present in array        	

        	//convert array into array list for easy search
        	List itemsNeededList = Arrays.asList(itemsNeeded);
        	
        	
        	
        	if (itemsNeededList.contains(formmattedName))
        	{
        		j++;        	
        		//click on Add to Cart
				driver.findElements(By.xpath("//button[@class='btn btn-info']")).get(i).click();
				System.out.println(formmattedName);
				if (j==itemsNeeded.length) {
					break;
				}
					
			}
		}
    }
	

}
