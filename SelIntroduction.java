import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

    public static void main(String[] args) throws InterruptedException {
      
        
        //Chrome Launch
        //webdriver.chrome.Driver
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\omar_\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        //Firefox Launch
        //webdriver.gecko.driver
        //System.setProperty("webdriver.gecko.driver", "C:\\Users\\omar_\\Downloads\\geckodriver-v0.36.0-win64\\geckodriver.exe");
        //WebDriver driver1 = new FirefoxDriver();
        
        //Edge Launch
        //webdriver.gecho.driver
        //System.setProperty("webdriver.gecko.driver", "C:\\Users\\omar_\\Downloads\\edgedriver_win64\\edgedriver.exe");
        //WebDriver driver2 = new EdgeDriver();
        
        
        // Maximize the browser window
        driver.manage().window().maximize();
        
        // Your test code here
        driver.get("https://rahulshettyacademy.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        
        // Retrieve page source
//        String pageSource = driver.getPageSource();
//        System.out.println("Page Source: " + pageSource);

        
        
        
        Thread.sleep(2000); // Wait for 2 seconds
        
        
        // Close the browser
        driver.quit();
    }
}