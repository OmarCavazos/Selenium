import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Create Variable name
		String name = "rahul";
		
		//webdriver.chrome.Driver
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\omar_\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        //Firefox Launch
//        System.setProperty("webdriver.gecko.driver", "C:\\Users\\omar_\\Downloads\\geckodriver-v0.36.0-win64\\geckodriver.exe");
//        WebDriver driver = new FirefoxDriver();
        
        //Edge Launch
//        System.setProperty("webdriver.gecko.driver", "C:\\Users\\omar_\\Downloads\\edgedriver_win64\\edgedriver.exe");
//        WebDriver driver = new EdgeDriver();
        
        
        // Maximize the browser window
        driver.manage().window().maximize();
        //wait time for loading page
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //create variable password and assign it from getPassword method
        String password = getPassword(driver);
        
        //Open website
        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        //Variable name is used as InputUsername
        driver.findElement(By.id("inputUsername")).sendKeys(name);

        //Variable password is used as InputPassword
        driver.findElement(By.name("inputPassword")).sendKeys(password);       
        
        driver.findElement(By.className("signInBtn")).click();
        
        //wait for login
        Thread.sleep(2000);
        //Print the successful login message
        System.out.println(driver.findElement(By.tagName("p")).getText());

        //Check that text matches the expected
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
        Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");
        driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText();

        //Log Out
        driver.findElement(By.xpath("//*[text()='Log Out']")).click();

		//wait
		Thread.sleep(1000);

        //close browser
        driver.close();

	}

	public static String getPassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();	
		//wait
		Thread.sleep(1000);
		
		//click on forgot password button
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

        //put password into a Variable
        String passwordText = driver.findElement(By.cssSelector("form p")).getText();
        
        //Message is displayed on screen "Please use temporary password 'rahulshettyacademy' to Login."
        
        //Array will be created using split
        String [] passwordArray = passwordText.split("'");
        //0th index = Please use temporary password
        //1st index = 'rahulshettyacademy' to Login.
        
        //split Array second time and stored as password
        String password = passwordArray[1].split("'")[0];
        //0th index = rahulshettyacademy
        //1st index = to Login.
        
        return password;
        
	}
}
