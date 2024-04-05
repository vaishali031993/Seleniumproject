package Seleniumproject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class checkoutprocess {


		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		Thread.sleep(3000);
		
		//test case 13:Verify that the checkout process consists of multiple steps (e.g., shipping address, payment method, order review).
        WebElement paymentMethodDropdown = driver.findElement(By.id("payment-method"));
	        paymentMethodDropdown.sendKeys("credit_card");
	        
	        
	       //Test case 14: Verify that each step of the checkout process can be completed successfully.

	        // Fill in credit card details
	        WebElement creditCardNumberInput = driver.findElement(By.id("credit-card-number"));
	        creditCardNumberInput.sendKeys("1234567890123456");
		WebElement CheckoutButton=driver.findElement(By.id("top-cart-btn-checkout"));
		 CheckoutButton.click();
		 
		 WebElement nextButton = driver.findElement(By.cssSelector(".button[name='next']"));
	        nextButton.click();
	        //Test case 15:Verify that the order confirmation page is displayed after successfully placing an order.
	        
	        WebDriverWait wait =new WebDriverWait (driver ,10);
	        wait.until(ExpectedConditions.urlContains("order-confirmation"));

	        // Test Case 16:Verify that the order confirmation page is displayed
	        if (driver.getCurrentUrl().contains("order-confirmation")) {
	            System.out.println("Order confirmation page displayed. Order placed successfully.");
	        } else {
	            System.out.println("Failed to reach the order confirmation page. Order placement unsuccessful.");
	        }
	        
	       
}


	        
}
		 
		
	 
