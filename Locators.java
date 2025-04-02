import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//webdriver.chrome.Driver
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\omar_\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        // Maximize the browser window
        driver.manage().window().maximize();
        //wait time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
        driver.get("https://rahulshettyacademy.com/locatorspractice/");        
        driver.findElement(By.id("inputUsername")).sendKeys("raul");
        driver.findElement(By.name("inputPassword")).sendKeys("test123");       
        driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());		
		driver.findElement(By.linkText("Forgot your password?")).click();		
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");                
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@test.com");
        driver.findElement(By.xpath("//input[@type='text'][2]")).clear();        
        driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("123456789");
        
        driver.findElement(By.cssSelector(".reset-pwd-btn")).sendKeys();
        
        System.out.println(driver.findElement(By.cssSelector("form p")).getText());

	}

}
