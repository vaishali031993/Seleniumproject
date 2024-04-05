package Seleniumproject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class useraccountmanagement {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com");
		Thread.sleep(2000);
		
		// Test Case 16:Verify that users can register for a new account.
 //        Click on the "Create an Account" link
        WebElement createAccountLink = driver.findElement(By.cssSelector(".header .authorization-link a"));
        createAccountLink.click();

        // Fill in registration form
        WebElement firstNameInput = driver.findElement(By.id("firstname"));
        firstNameInput.sendKeys("puja");

        WebElement lastNameInput = driver.findElement(By.id("lastname"));
        lastNameInput.sendKeys("ambekar");
        
        WebElement emailInput = driver.findElement(By.id("email_address"));
        emailInput.sendKeys("test@example.com");

        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys("password123");

        WebElement confirmPasswordInput = driver.findElement(By.id("password-confirmation"));
        confirmPasswordInput.sendKeys("password123");

        // Click on the "Create an Account" button
        WebElement createAccountButton = driver.findElement(By.cssSelector(".submit .action.submit.primary"));
        createAccountButton.click();

        // Test case17 :Verify registration success message
        WebElement successMessage = driver.findElement(By.cssSelector(".message-success"));
        if (successMessage.getText().contains("Thank you for registering with Main Website Store.")) {
            System.out.println("User registration successful.");
        } else {
            System.out.println("User registration failed.");
        }

		
		driver.close();

	}

}
