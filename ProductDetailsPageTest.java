package Seleniumproject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductDetailsPageTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		Thread.sleep(2000);
		
		// Test Case 8: Verify that clicking on a product leads to the product details page
		WebElement product=driver.findElement(By.cssSelector("product-item-link"));
		product.click();
		
		//Test Case 9 :Verify that all product details (e.g., name, price, description) are displayed correctly.
      driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[2]"));
      
      //Test case 10:Verify that sorting and filtering options (e.g., by price, by popularity) are functional.
      WebElement  sortingdropdown=driver.findElement(By.id("title"));
      sortingdropdown.click();

      WebElement sortingbypriceoption=driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[4]/div[1]"));
      sortingbypriceoption.click();
      
      //test case 11: Verify that product images can be zoomed in and out.
      WebElement productIamge=driver.findElement(By.cssSelector("fotorama__zoom-in zoom-in-loaded"));
      productIamge.click();
      
      WebElement ProductImage=driver.findElement(By.cssSelector("fotorama__zoom-out zoom-out-loaded"));
      ProductImage.click();
      
      //Test case 12 :Verify that the "Add to Cart" button adds the product to the cart successfully.
      WebElement Addtocart=driver.findElement(By.id("product-addtocart-button"));
      Addtocart.click();
      
      
      driver.close();
      
      
 
      
	}

      
      
      
      
      
      
		
	}


