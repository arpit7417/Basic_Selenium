package Synchronization;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Shoppersstack01 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://shoppersstack.com/products_page/119");
		
		//driver.findElement(By.id("Check Delivery")).sendKeys("246761");
		//driver.findElement(By.id("Check")).click();
		
		
	//	WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(20));
		//driver.get("https://shoppersstack.com/products_page/119");
		
		//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("Check Delivery")));
		//driver.findElement(By.id("Check Delivery")).sendKeys("246761");
		
		
	//	wait.until(ExpectedConditions.elementToBeClickable(By.id("Check")));
		//driver.findElement(By.id("Check")).click();
		
		
		FluentWait wait2=new FluentWait(driver);
	     wait2.withTimeout(Duration.ofSeconds(15));
		wait2.pollingEvery(Duration.ofSeconds(2));
		wait2.ignoring(NoSuchElementException.class);
		
		wait2.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("Check Delivery")));
		driver.findElement(By.id("Check Delivery")).sendKeys("246761");
		
		
		wait2.until(ExpectedConditions.elementToBeClickable(By.id("Check")));
		driver.findElement(By.id("Check")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
