package working_with_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DirectLocator {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		
		WebElement  username=driver.findElement(By.id("email"));
		username.sendKeys("admin");
		
		
		driver.findElement(By.name("pass")).sendKeys("1234567890");
		
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("f")).click();
		
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
		
	}

}
