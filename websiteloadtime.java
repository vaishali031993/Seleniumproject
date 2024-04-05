package Seleniumproject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class websiteloadtime {

	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		Thread.sleep(3000);
		
		long endTime = System.currentTimeMillis();

        // Close the browser
        driver.quit();
	}
}
    

	


