package com.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WorkflowApp {
	WebDriver driver;
	
	@BeforeClass
    public void setUp() {
        // If chromedriver is not in system PATH, set path like this:
        // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
    }
	
	@Test
    public void testGoogleSearch() {
		
        driver.get("https://493.app.cloud.papersave.com/Workflow");
        //WebElement searchBox = driver.findElement(By.name("q"));
        //searchBox.sendKeys("Selenium WebDriver");
        //searchBox.submit();

        // Simple check: print page title
        System.out.println("Page title is: " + driver.getTitle());
    }
	
	
}
