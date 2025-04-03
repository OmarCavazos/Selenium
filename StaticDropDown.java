import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//webdriver.chrome.Driver
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\omar_\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        
        // Maximize the browser window
        driver.manage().window().maximize();
        //wait time for loading page
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
        //Open website
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        
        //Dropdown with Select tag
        WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdown = new Select(staticDropdown);
        
        //Select from dropdown by Index
        dropdown.selectByIndex(3);
        System.out.println(dropdown.getFirstSelectedOption().getText());        
        Thread.sleep(1000);

        //Select from dropdown by Visible text
        dropdown.selectByVisibleText("AED");
        System.out.println(dropdown.getFirstSelectedOption().getText());
        Thread.sleep(1000);
        
        //Select from dropdown by Value
        dropdown.selectByValue("INR");
        System.out.println(dropdown.getFirstSelectedOption().getText());
        
        
        
	}

}
