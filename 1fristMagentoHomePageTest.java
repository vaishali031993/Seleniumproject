package Seleniumproject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fristMagentoHomePageTest {

	public static void main(String[] args) {
	
	        // Initialize ChromeDriver
	        WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	        // Navigate to the Magento homepage
	        driver.get("https://magento.softwaretestingboard.com/");

	        // Test Case 1: Verify that the homepage loads successfully
	        if (driver.getTitle().contains("Magento")) {
	            System.out.println("Test Case 1: Homepage loaded successfully - PASSED");
	        } else {
	            System.out.println("Test Case 1: Homepage failed to load - FAILED");
	        }

	        // Test Case 2: Verify that all main navigation links are clickable and lead to the respective pages
	        WebElement homeLink = driver.findElement(By.linkText("Home"));
	        homeLink.click();
	        if (driver.getCurrentUrl().equals("https://magento.softwaretestingboard.com/")) {
	            System.out.println("Test Case 2: Home link is clickable and leads to the respective page - PASSED");
	        } else {
	            System.out.println("Test Case 2: Home link is not clickable or does not lead to the respective page - FAILED");
	        }

	        WebElement productsLink = driver.findElement(By.linkText("Products"));
	        productsLink.click();
	        // Add similar validation for other navigation links (e.g., Categories)

	        // Test Case 3: Verify that featured products or promotions are displayed correctly
	        // Add your validation logic here

	        // Test Case 4: Verify that the search bar is functional
	        WebElement searchBar = driver.findElement(By.id("search"));
	        searchBar.sendKeys("product");
	        WebElement searchButton = driver.findElement(By.className("action search"));
	        searchButton.click();
	        // Add validation logic for search results

	        // Close the browser
	        driver.quit();
	    }
	

	}

