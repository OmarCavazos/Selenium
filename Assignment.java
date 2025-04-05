import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//webdriver.chrome.Driver
		WebDriver driver = new FirefoxDriver();
		
        // Maximize the browser window
        driver.manage().window().maximize();
        
        //wait time for loading page
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
        //Open URL
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        
        driver.findElement(By.name("name")).sendKeys("Rahul");        
        driver.findElement(By.name("email")).sendKeys("Rahul@test.com");        
        driver.findElement(By.id("exampleInputPassword1")).sendKeys("test123");        
        driver.findElement(By.xpath("//input[@id='exampleCheck1']")).click();        
        //driver.findElement(By.xpath("//select[@id='exampleFormControlSelect1'][1]")).click();
        WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
        Select abc = new Select(dropdown);
        abc.selectByVisibleText("Female");
        driver.findElement(By.id("inlineRadio1")).click();        
        driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("1992-01-15");        
        driver.findElement(By.xpath("//input[@value='Submit']")).click();        
        
        String alertText = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText();        
        System.out.println(alertText);        
                        
        driver.close();
	}

}
