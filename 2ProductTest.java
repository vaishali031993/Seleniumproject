package Seleniumproject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://magento.softwaretestingboard.com/what-is-new.html");
	   Thread.sleep(3000);
	  //Test case 5: homepage load successfully
	   if(driver.getTitle().contains("Magneto")) 
	   {
		  System.out.println("Homepage load successfully  passed"); 
	   }
	   else
	   {
		   System.out.println("Homepage load failed");
	   }
	   
	   
	   // Test Case 6: Verify that all main navigation links are clickable and lead to the respective pages
	   WebElement homelink=driver.findElement(By.linkText("Home"));
	   homelink.click();
	   
	   if (driver.getCurrentUrl().equals("https://magento.softwaretestingboard.com/")) 
	   {
           System.out.println("Test Case 2: Home link is clickable and leads to the respective page - PASSED");
       } else {
           System.out.println("Test Case 2: Home link is not clickable or does not lead to the respective page - FAILED");
       }

       WebElement productsLink = driver.findElement(By.linkText("Products"));
       productsLink.click();
    

       // Test Case 7: Verify that the search bar is functional
       WebElement searchBar = driver.findElement(By.id("search_autocomplete"));
       searchBar.sendKeys("Womens");
       WebElement searchButton = driver.findElement(By.className("count"));
       searchButton.click();
       

   

       // Close the browser
       driver.quit();
   }
}
	 
	   
	   
	   
	   
	   
	   
	   
	   
