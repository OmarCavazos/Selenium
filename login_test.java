package com.qualitystream.tutorial;

import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class login_test {
    private WebDriver driver;
    
    @Before
    public void setUp() {
        // Set up ChromeDriver path
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromeDriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    
    @Test
    public void testPage() {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
    	WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));


        // Enter valid credentials
        username.sendKeys("Admin");
        passwordField.sendKeys("admin123");

        // Locate and click the "Login" button
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));  // This assumes the login button is a submit button
        loginButton.click();

        // Add any additional assertions or waits if necessary
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait1.until(ExpectedConditions.urlContains("dashboard")); // Example: Wait until the URL changes to the dashboard

        // Optional: Assert the page after login
        assertEquals("OrangeHRM", driver.getTitle());
    }

    /*@After
    public void tearDown() {
        // Close the browser after the test
        driver.quit();
    }*/
}
