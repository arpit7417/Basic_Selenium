package Locator_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Attributevalue {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/singh/Downloads/assignment.html");
		
		WebElement loginbutton=driver.findElement(By.xpath("//button[@type='submit']"));
		loginbutton.click();
		
		System.out.println("loginbutton is:"+loginbutton.isSelected());
		
		
		
		WebElement searchhere=driver.findElement(By.xpath("//input[@placeholder='Search here']"));
		searchhere.sendKeys("search the important topic");
		System.out.println("searchhere is:"+ searchhere.isDisplayed());
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
