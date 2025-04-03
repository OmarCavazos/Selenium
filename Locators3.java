import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//webdriver.chrome.Driver
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\omar_\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        // Maximize the browser window
        driver.manage().window().maximize();
        //wait time for loading page
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
        //Open website
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");


        //xpath Child to parent
        //header/div/button[1]/parent::div
        
        //xpath Sibling to sibling
        //header/div/button[1]/following-sibling::button[1]
        
        //Click on login button
        System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
        
        System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());
        
        
	}

}
