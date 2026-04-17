package working_with_locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*; 

public class BasicLocatorsDemo {
	
		public static void main(String[] args) throws InterruptedException {
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        // Navigate to the webpage
	        driver.get("https://www.facebook.com/"); // Replace with a real page having buttons

	        // 1. Locate by ID
	        WebElement buttonById = driver.findElement(By.id("u_0_5_aA"));
	        System.out.println("Button found using ID: " + buttonById.getText());

	        // 2. Locate by Name
	        WebElement buttonByName = driver.findElement(By.name("login"));
	        System.out.println("Button found using Name: " + buttonByName.getText());

	        // 3. Locate by Class Name
	        WebElement buttonByClass = driver.findElement(By.className("_42ft"));
	        System.out.println("Button found using Class Name: " + buttonByClass.getText());

	        // 4. Locate by Tag Name (finds the first <button>)
	        WebElement buttonByTag = driver.findElement(By.tagName("button"));
	        System.out.println("Button found using Tag Name: " + buttonByTag.getText());

	        // 5. Locate by Link Text (works only for <a> elements, not <button>)
	        WebElement linkByText = driver.findElement(By.linkText("Forgotten password?"));
	        System.out.println("Link found using Link Text: " + linkByText.getText());

	        // 6. "Idhar Udhar" - Invalid locator (so we'll just print a message)
	        System.out.println("'Idhar Udhar' is not a valid Selenium locator.");

	        Thread.sleep(2000);
	        driver.quit();
	}

}
