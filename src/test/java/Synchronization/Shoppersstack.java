package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shoppersstack {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://shoppersstack.com/products_page/4199");
		driver.findElement(By.xpath("//input[@id='Check Delivery']")).sendKeys("246761");

		  driver.findElement(By.xpath("//button[text()='Check']")).click();
		  
		  Thread.sleep(3000);
		  
		driver.quit();
	
	}

}
